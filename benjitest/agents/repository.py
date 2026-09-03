"""Repository Crew agents (Section 3.1.1, Appendix B).

The Repository Manager validates and sandboxes a target project; the Repository
Miner produces the curated project tree that every downstream crew consumes.
Both are tool agents: their contracts are entirely deterministic, and routing
sandbox creation or directory traversal through a language model would introduce
nondeterminism into the one part of the pipeline that must be reproducible.
"""

from __future__ import annotations

import logging
from pathlib import Path

from ..build.dependencies import inject
from ..build.integration import BuildStatus, BuildSystem
from ..build.sandbox import create_sandbox
from ..java.project import build_project_tree, detect_build_metadata, index_project_types
from ..llm.tokens import count_tokens, truncate_to_tokens
from .base import AgentOutput, AgentSpec, CrewContext, ToolAgent

logger = logging.getLogger(__name__)

REPOSITORY_MANAGER = "Repository Manager"
REPOSITORY_MINER = "Repository Miner"


class RepositoryManagerAgent(ToolAgent):
    """Validates project integrity and prepares an isolated sandbox.

    Appendix B: *"Creates a clean isolated copy (working directory) of each
    project; inspects pom.xml/build.gradle to detect Java version and build tool;
    uses Maven/Gradle wrappers to ensure the project compiles in its original
    state, isolating the evaluation from local OS differences."*

    Context inputs:
        ``project_root``, and optionally ``workdir``.

    Context outputs:
        ``sandbox``, ``build_metadata``, ``layout``, ``project_types``.
    """

    spec = AgentSpec(
        name=REPOSITORY_MANAGER,
        role=(
            "Java Project Specialist, focused on validating project integrity, "
            "detecting environment requirements (e.g., JDK version), and preparing "
            "a safe sandbox."
        ),
        goal=(
            "Produce a clean, compilable, isolated working copy of each target "
            "project, free of human-written tests."
        ),
        backstory=(
            "You are responsible for the reproducibility of every downstream "
            "measurement. A project that does not build in its original state "
            "cannot yield an interpretable compilation rate."
        ),
        prompt_file="repository_manager_agent.txt",
        returns="Paths to the isolated working directories of validated projects.",
    )

    def __init__(
        self,
        *,
        build_system: BuildSystem,
        purge_existing_tests: bool = True,
        inject_dependencies: bool = True,
        reuse_sandboxes: bool = False,
        skip_validation: bool = False,
        **kwargs,
    ) -> None:
        super().__init__(**kwargs)
        self.build_system = build_system
        self.purge_existing_tests = purge_existing_tests
        self.inject_dependencies = inject_dependencies
        self.reuse_sandboxes = reuse_sandboxes
        self.skip_validation = skip_validation

    def execute(self, context: CrewContext) -> AgentOutput:
        project_root = Path(context["project_root"])
        workdir = context.get("workdir")

        # Step 1 -- detect build tool and required JDK from the build files.
        metadata = detect_build_metadata(project_root)
        if metadata.tool == "unknown":
            return AgentOutput(
                agent=self.spec.name,
                ok=False,
                error=f"no Maven or Gradle build file found in {project_root}",
            )
        self.build_system.metadata = metadata

        # Step 2 -- verify the project compiles untouched, before we modify it.
        if not self.skip_validation:
            validation = self.build_system.validate(project_root)
            if validation.status is not BuildStatus.SUCCESS:
                return AgentOutput(
                    agent=self.spec.name,
                    ok=False,
                    error=(
                        f"project does not compile in its original state "
                        f"({validation.status.value}); excluded from the campaign"
                    ),
                    text=validation.error,
                    structured={"validation_status": validation.status.value},
                )

        # Step 3 -- isolated copy with human-written tests purged.
        sandbox = create_sandbox(
            project_root,
            workdir=workdir,
            purge_existing_tests=self.purge_existing_tests,
            reuse=self.reuse_sandboxes,
        )

        # Step 4 -- ensure the test and measurement toolchain is available.
        injection = None
        if self.inject_dependencies:
            injection = inject(
                sandbox.path,
                build_tool=metadata.tool,
                junit_version=metadata.junit_version,
            )

        project_types = index_project_types(sandbox.path, layout=sandbox.layout)

        context["sandbox"] = sandbox
        context["build_metadata"] = metadata
        context["layout"] = sandbox.layout
        context["project_types"] = project_types

        summary = (
            f"Sandbox ready at {sandbox.path}\n"
            f"Build tool: {metadata.tool}\n"
            f"Java version: {metadata.java_version or 'unspecified'}\n"
            f"Test framework: {metadata.test_framework}\n"
            f"Purged human-written tests: {len(sandbox.purged_tests)}\n"
            f"Indexed project types: {len(project_types)}"
        )
        if injection and injection.modified:
            summary += (
                f"\nInjected dependencies: {', '.join(injection.added_dependencies) or 'none'}"
                f"\nInjected plugins: {', '.join(injection.added_plugins) or 'none'}"
            )

        return AgentOutput(
            agent=self.spec.name,
            text=summary,
            structured={
                "sandbox_path": str(sandbox.path),
                "build_tool": metadata.tool,
                "java_version": metadata.java_version,
                "test_framework": metadata.test_framework,
                "purged_tests": len(sandbox.purged_tests),
            },
        )


class RepositoryMinerAgent(ToolAgent):
    """Produces the curated textual project tree.

    Appendix B: *"Scans source roots and packages (Maven/Gradle and non-standard
    layouts), produces a curated indented textual project tree, and filters out
    binaries, build artifacts, and hidden files to reduce the downstream context
    window."*

    Per Section 3.1 the output is truncated to 2,000 tokens, retaining only the
    top-level package structure.

    Context inputs:
        ``sandbox`` (or ``project_root``).

    Context outputs:
        ``project_tree``.
    """

    spec = AgentSpec(
        name=REPOSITORY_MINER,
        role="Java Project Analyst.",
        goal=(
            "Produce a compact, curated view of the project's source roots and "
            "package structure for downstream agents."
        ),
        backstory=(
            "Downstream agents operate under a strict context budget. Your output "
            "must convey the project's shape without spending tokens on build "
            "artifacts or file-by-file detail."
        ),
        prompt_file="repository_miner_agent.txt",
        returns="A structured text-based project tree saved in the working directory.",
    )

    def __init__(self, *, max_tokens: int = 2_000, save_to_workdir: bool = True, **kwargs) -> None:
        super().__init__(**kwargs)
        self.max_tokens = max_tokens
        self.save_to_workdir = save_to_workdir

    def execute(self, context: CrewContext) -> AgentOutput:
        sandbox = context.get("sandbox")
        root = Path(sandbox.path) if sandbox else Path(context["project_root"])
        layout = context.get("layout") or (sandbox.layout if sandbox else None)

        tree = build_project_tree(root, layout=layout, packages_only=True)
        raw_tokens = count_tokens(tree)
        tree = truncate_to_tokens(tree, self.max_tokens)

        if self.save_to_workdir:
            try:
                (root / ".benjitest-project-tree.txt").write_text(tree, encoding="utf-8")
            except OSError as exc:
                logger.debug("could not persist project tree: %s", exc)

        context["project_tree"] = tree
        return AgentOutput(
            agent=self.spec.name,
            text=tree,
            structured={
                "tokens": min(raw_tokens, self.max_tokens),
                "truncated": raw_tokens > self.max_tokens,
                "source_roots": [str(p) for p in (layout.main_source_roots if layout else [])],
            },
        )
