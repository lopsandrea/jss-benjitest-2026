"""The Coordinator -- Algorithm 1 of the paper.

The central orchestrator. It sequences the agent crews, interfaces with the core
modules, and iterates over every <project, class, model, strategy> combination
declared in the configuration:

.. code-block:: text

    for each project P
      sandbox <- RepositoryManager.setup(P)
      tree    <- RepositoryMiner.scan(sandbox)
      for each class C, model M, strategy S
        test   <- <strategy-specific generation path>
        result <- BuildSystem.compileAndRun(test, sandbox)
        if result.failed and correction enabled
          test, result <- CorrectionLoop(...)
        ReportGenerator.record(P, C, M, S, result)

Only the final structured output of each crew crosses a crew boundary, never the
full agent conversation (Section 3.1).
"""

from __future__ import annotations

import logging
import shutil
import threading
import time
from concurrent.futures import ThreadPoolExecutor, as_completed
from contextlib import contextmanager
from dataclasses import dataclass, field
from pathlib import Path
from queue import Empty, Queue

from .agents.base import CrewContext
from .agents.developer import render_template, template_variables
from .build.integration import BuildResult, BuildSystem
from .build.sandbox import Sandbox
from .config.schema import (
    BenjiTestConfig,
    LLMConfig,
    StrategyConfig,
    StrategyType,
)
from .correction.loop import CorrectionResult, run_correction_loop
from .crews.factory import CrewFactory
from .datasets.base import Dataset, TargetClass
from .datasets.classes2test import Classes2TestDataset
from .java.model import JavaClass
from .java.parser import JavaParseError, parse_file
from .java.project import index_project_types
from .llm.layer import LLMLayer
from .metrics.model import TestMetrics
from .report.generator import ReportGenerator, build_record_from_result
from .report.records import GenerationRecord

logger = logging.getLogger(__name__)


@dataclass(slots=True)
class Task:
    """One unit of work: a class, a model, and a strategy."""

    target: TargetClass
    llm: LLMConfig
    strategy: StrategyConfig

    @property
    def key(self) -> tuple[str, str, str, str]:
        return (
            self.target.project_id,
            self.target.qualified_name or self.target.class_name,
            self.llm.name,
            self.strategy.name,
        )


@dataclass(slots=True)
class RunSummary:
    """Campaign-level outcome returned by :meth:`Coordinator.run`."""

    projects_processed: int = 0
    projects_skipped: int = 0
    tasks_executed: int = 0
    tasks_skipped: int = 0
    tasks_failed: int = 0
    duration_seconds: float = 0.0
    report: dict[str, object] = field(default_factory=dict)
    llm_usage: dict[str, object] = field(default_factory=dict)


class SandboxPool:
    """A pool of interchangeable sandboxes for parallel task execution.

    The Repository Crew validates and prepares one sandbox per project; running
    several tasks concurrently inside it would let one generated test class
    collide with another's compilation output. The pool hands each worker its own
    copy, cloned from the already-prepared template so that validation, purging
    and dependency injection are paid for once.
    """

    def __init__(self, template: Sandbox, size: int, *, workdir: Path) -> None:
        self.template = template
        self.workdir = workdir
        self._queue: Queue[Sandbox] = Queue()
        self._clones: list[Sandbox] = []
        self._queue.put(template)

        for index in range(1, max(1, size)):
            clone = self._clone(index)
            if clone is None:
                break
            self._clones.append(clone)
            self._queue.put(clone)

    def _clone(self, index: int) -> Sandbox | None:
        destination = self.workdir / f"{self.template.path.name}--w{index}"
        try:
            if destination.exists():
                shutil.rmtree(destination, ignore_errors=True)
            shutil.copytree(self.template.path, destination, symlinks=True)
        except (OSError, shutil.Error) as exc:
            logger.warning("could not clone sandbox for worker %d: %s", index, exc)
            return None
        from .java.project import detect_layout

        return Sandbox(
            path=destination,
            origin=self.template.origin,
            layout=detect_layout(destination),
            purged_tests=list(self.template.purged_tests),
        )

    @contextmanager
    def acquire(self, timeout: float = 3600.0):
        try:
            sandbox = self._queue.get(timeout=timeout)
        except Empty as exc:  # pragma: no cover - only under pathological load
            raise RuntimeError("timed out waiting for a free sandbox") from exc
        try:
            yield sandbox
        finally:
            # Leave no test class behind: the next task must start clean.
            sandbox.remove_installed_test()
            self._queue.put(sandbox)

    def cleanup(self) -> None:
        for clone in self._clones:
            shutil.rmtree(clone.path, ignore_errors=True)
        self._clones.clear()


class Coordinator:
    """Orchestrates a full BenjiTest campaign.

    Args:
        config: The validated experiment configuration.
        dataset: Source of classes under test; a
            :class:`~benjitest.datasets.classes2test.Classes2TestDataset` is
            built from the configuration when omitted.
        llm_layer: Shared LLM Interaction Layer; one is created when omitted.
        workdir: Where sandboxes are created.
    """

    def __init__(
        self,
        config: BenjiTestConfig,
        *,
        dataset: Dataset | None = None,
        llm_layer: LLMLayer | None = None,
        workdir: str | Path | None = None,
    ) -> None:
        self.config = config
        self.dataset = dataset or Classes2TestDataset(config.dataset)
        self.workdir = Path(workdir) if workdir else config.root_dir / ".benjitest" / "sandboxes"
        self.workdir.mkdir(parents=True, exist_ok=True)

        self.llm_layer = llm_layer or LLMLayer(
            cache_dir=config.root_dir / ".benjitest" / "cache",
            transcript_dir=(
                config.logging.log_dir / "transcripts"
                if config.logging.save_llm_responses
                else None
            ),
        )
        self.build_system = BuildSystem(config.build)
        self.crew_factory = CrewFactory(config, self.llm_layer)
        self.reporter = ReportGenerator(
            config.reporting, config.metrics, build_system=self.build_system
        )
        self._static_templates: dict[str, str] = {}
        self._completed: set[tuple[str, str, str, str]] = (
            self.reporter.completed_keys() if config.execution.resume else set()
        )
        self._counter_lock = threading.Lock()

    # ------------------------------------------------------------------
    def run(self) -> RunSummary:
        """Execute the campaign and return a summary."""
        started = time.monotonic()
        summary = RunSummary()
        grouped = self._resolve_targets()

        if not grouped:
            logger.warning("no target classes were resolved; nothing to do")
            return summary

        logger.info(
            "campaign: %d project(s), %d class(es), %d model(s) x %d strateg(ies)",
            len(grouped),
            sum(len(v) for v in grouped.values()),
            len(self.config.llms),
            len(self.config.strategies),
        )

        for project_id, targets in grouped.items():
            project_summary = self._run_project(project_id, targets)
            if project_summary is None:
                summary.projects_skipped += 1
                continue
            summary.projects_processed += 1
            summary.tasks_executed += project_summary["executed"]
            summary.tasks_skipped += project_summary["skipped"]
            summary.tasks_failed += project_summary["failed"]

        self.reporter.write_aggregate()
        self.reporter.write_correction_breakdown()

        summary.duration_seconds = time.monotonic() - started
        summary.report = self.reporter.summary()
        summary.llm_usage = self.llm_layer.usage.snapshot()
        return summary

    # ------------------------------------------------------------------
    def _resolve_targets(self) -> dict[str, list[TargetClass]]:
        if self.config.projects:
            # Explicit project list in the YAML overrides the dataset scan.
            grouped: dict[str, list[TargetClass]] = {}
            from .java.project import detect_layout, list_main_classes

            for project_root in self.config.projects:
                project_id = Path(project_root).name
                layout = detect_layout(project_root)
                for source_path in list_main_classes(project_root, layout=layout):
                    grouped.setdefault(project_id, []).append(
                        TargetClass(
                            project_id=project_id,
                            project_root=Path(project_root),
                            source_path=source_path,
                        )
                    )
            return grouped
        return self.dataset.targets_by_project()

    # ------------------------------------------------------------------
    def _run_project(self, project_id: str, targets: list[TargetClass]) -> dict[str, int] | None:
        """Phase 1 and 2 for a single project."""
        project_root = targets[0].project_root
        logger.info("preparing project %s (%d class(es))", project_id, len(targets))

        # --- Phase 1: Repository Crew -------------------------------------
        build_system = BuildSystem(self.config.build)
        repository_crew = self.crew_factory.build_repository_crew(build_system)
        project_context = CrewContext(
            project_root=project_root,
            workdir=self.workdir / project_id,
        )
        repository_result = repository_crew.kickoff(project_context)

        if not repository_result.ok:
            logger.warning("skipping %s: %s", project_id, repository_result.error)
            return None

        template_sandbox: Sandbox = project_context["sandbox"]
        # Only the crew's final structured output crosses the boundary.
        project_tree: str = repository_result.final or ""
        project_types = project_context.get("project_types") or index_project_types(
            template_sandbox.path
        )
        build_metadata = project_context["build_metadata"]

        tasks = self._build_tasks(targets)
        counters = {"executed": 0, "skipped": len(targets) * self.config.total_task_count_per_class - len(tasks), "failed": 0}

        if not tasks:
            logger.info("project %s: every task already recorded; skipping", project_id)
            return counters

        workers = max(1, self.config.execution.parallel_jobs)
        pool = SandboxPool(template_sandbox, workers, workdir=self.workdir / project_id)

        try:
            if workers == 1:
                for task in tasks:
                    self._safe_execute(task, pool, project_tree, project_types, build_metadata, counters)
            else:
                with ThreadPoolExecutor(max_workers=workers) as executor:
                    futures = [
                        executor.submit(
                            self._safe_execute,
                            task,
                            pool,
                            project_tree,
                            project_types,
                            build_metadata,
                            counters,
                        )
                        for task in tasks
                    ]
                    for future in as_completed(futures):
                        future.result()
        finally:
            pool.cleanup()
            if not self.config.execution.allow_reuse_project_sandboxes:
                shutil.rmtree(template_sandbox.path, ignore_errors=True)

        return counters

    def _build_tasks(self, targets: list[TargetClass]) -> list[Task]:
        """Expand targets into <class, model, strategy> tasks, skipping completed ones."""
        tasks: list[Task] = []
        for target in targets:
            for llm in self.config.llms:
                for strategy in self.config.strategies:
                    task = Task(target=target, llm=llm, strategy=strategy)
                    if task.key in self._completed:
                        continue
                    tasks.append(task)
        return tasks

    def _safe_execute(
        self,
        task: Task,
        pool: SandboxPool,
        project_tree: str,
        project_types: dict[str, str],
        build_metadata,
        counters: dict[str, int],
    ) -> None:
        try:
            with pool.acquire() as sandbox:
                record = self._execute_task(
                    task, sandbox, project_tree, project_types, build_metadata
                )
        except Exception as exc:
            logger.exception("task %s failed unexpectedly", task.key)
            record = GenerationRecord(
                project_id=task.target.project_id,
                class_name=task.target.class_name,
                qualified_name=task.target.qualified_name or task.target.class_name,
                model=task.llm.name,
                strategy=task.strategy.name,
                error=f"{type(exc).__name__}: {exc}",
            )

        self.reporter.record(record)
        with self._counter_lock:
            counters["executed"] += 1
            if not record.compiled:
                counters["failed"] += 1

    # ------------------------------------------------------------------
    def _execute_task(
        self,
        task: Task,
        sandbox: Sandbox,
        project_tree: str,
        project_types: dict[str, str],
        build_metadata,
    ) -> GenerationRecord:
        """Phase 2 and 3 for one <class, model, strategy> tuple."""
        started = time.monotonic()
        target = task.target

        try:
            cut = self._parse_target(target, sandbox)
        except (JavaParseError, OSError) as exc:
            return GenerationRecord(
                project_id=target.project_id,
                class_name=target.class_name,
                qualified_name=target.qualified_name or target.class_name,
                model=task.llm.name,
                strategy=task.strategy.name,
                error=f"could not parse the class under test: {exc}",
            )

        context = CrewContext(
            cut=cut,
            sandbox=sandbox,
            project_tree=project_tree,
            project_types=project_types,
            build_metadata=build_metadata,
            layout=sandbox.layout,
            strategy=task.strategy,
        )

        if task.strategy.type is StrategyType.STATIC:
            context["static_prompt"] = self._render_static_prompt(task.strategy, cut, context)

        # --- generation ----------------------------------------------------
        generation_crew = self.crew_factory.build_generation_crew(task.strategy, task.llm)
        generation_result = generation_crew.kickoff(context)
        test_code = context.get("test_code")

        if not test_code:
            record = GenerationRecord(
                project_id=target.project_id,
                class_name=cut.name,
                qualified_name=cut.qualified_name,
                model=task.llm.name,
                strategy=task.strategy.name,
                error=generation_result.error or "the Test Developer produced no code",
                prompt_tokens=generation_result.prompt_tokens,
                completion_tokens=generation_result.completion_tokens,
                duration_seconds=time.monotonic() - started,
            )
            return record

        test_class_name = context.get("test_class_name") or f"{cut.name}Test"
        test_package = context.get("test_package") or cut.package
        qualified_test = (
            f"{test_package}.{test_class_name}" if test_package else test_class_name
        )

        # --- validation ------------------------------------------------------
        sandbox.install_test(test_code, package=test_package, class_name=test_class_name)
        initial_result: BuildResult = self.build_system.compile_and_run(sandbox, qualified_test)

        # --- correction ------------------------------------------------------
        correction: CorrectionResult | None = None
        final_result = initial_result
        if initial_result.failed and self.config.correction.enabled:
            correction_agents = self.crew_factory.build_correction_agents(
                task.strategy, task.llm
            )
            correction = run_correction_loop(
                test_code=test_code,
                cut=cut,
                build_result=initial_result,
                sandbox=sandbox,
                build_system=self.build_system,
                agents=correction_agents,
                config=self.config.correction,
                context=context,
                test_class_name=test_class_name,
                test_package=test_package,
            )
            test_code = correction.test_code
            final_result = correction.build_result

        # --- Phase 3: evaluation and reporting --------------------------------
        metrics = TestMetrics()
        if final_result.compiled:
            metrics = self.reporter.compute_metrics(
                sandbox=sandbox,
                cut=cut,
                test_code=test_code,
                test_class_qualified_name=qualified_test,
                build_result=final_result,
            )

        record = build_record_from_result(
            project_id=target.project_id,
            cut=cut,
            model=task.llm.name,
            strategy=task.strategy.name,
            initial_result=initial_result,
            correction=correction,
            final_result=final_result,
            metrics=metrics,
        )
        record.prompt_tokens = generation_result.prompt_tokens + context.usage["prompt_tokens"]
        record.completion_tokens = (
            generation_result.completion_tokens + context.usage["completion_tokens"]
        )
        record.duration_seconds = time.monotonic() - started
        record.test_file = self.reporter.save_test_file(
            record, test_code, test_class_name=test_class_name
        )
        if final_result.failed:
            self.reporter.save_error_log(record, final_result.log)

        return record

    # ------------------------------------------------------------------
    def _parse_target(self, target: TargetClass, sandbox: Sandbox) -> JavaClass:
        """Parse the class under test from inside the sandbox.

        The sandbox copy is authoritative: it is the code the tests will actually
        compile against.
        """
        source_path = target.source_path
        try:
            relative = source_path.relative_to(target.project_root)
        except ValueError:
            relative = None
        if relative is not None:
            candidate = sandbox.path / relative
            if candidate.is_file():
                source_path = candidate
        return parse_file(source_path, target_class=target.source_path.stem)

    def _render_static_prompt(
        self, strategy: StrategyConfig, cut: JavaClass, context: CrewContext
    ) -> str:
        """Render a static template with the class-specific values.

        Section 4.3: static prompts are templates with placeholders that
        BenjiTest populates at runtime, which is how the baseline scales to
        147,473 classes.
        """
        template = self._static_templates.get(strategy.name)
        if template is None:
            path = Path(strategy.prompt_file)
            if not path.is_file():
                raise FileNotFoundError(
                    f"strategy '{strategy.name}': prompt file not found at {path}"
                )
            template = path.read_text(encoding="utf-8")
            self._static_templates[strategy.name] = template
        return render_template(template, template_variables(cut, context))
