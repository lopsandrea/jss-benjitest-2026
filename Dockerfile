# BenjiTest -- reproducible evaluation environment.
#
#   docker build -t benjitest .
#   docker run --rm benjitest                     # runs the test suite
#   docker run --rm -it benjitest bash            # interactive shell
#   docker run --rm -e OPENAI_API_KEY=... benjitest \
#       benjitest run config/experiments/framework_test-full-evaluation.yaml \
#       --models gpt-4.1 --strategies dynamic --limit 20
#
# The image carries the full Java toolchain so that a reviewer can exercise the
# pipeline -- sandboxing, build, JaCoCo, PIT, smell detection -- without
# installing anything. Only the LLM calls need network and credentials.

FROM eclipse-temurin:17-jdk-jammy

ENV DEBIAN_FRONTEND=noninteractive \
    PYTHONUNBUFFERED=1 \
    PIP_NO_CACHE_DIR=1

# --- system toolchain -------------------------------------------------------
RUN apt-get update && apt-get install -y --no-install-recommends \
        python3 python3-pip python3-venv \
        maven gradle git curl unzip ca-certificates \
        perl libdbi-perl liburi-perl libjson-perl \
    && rm -rf /var/lib/apt/lists/*

# --- JDK 8, needed for the EvoSuite baseline and for legacy target projects --
RUN apt-get update && apt-get install -y --no-install-recommends \
        openjdk-8-jdk \
    && rm -rf /var/lib/apt/lists/*
ENV JAVA_HOME_8=/usr/lib/jvm/java-8-openjdk-amd64 \
    JAVA_HOME_17=/opt/java/openjdk

# --- tsDetect: the smell detector the paper uses ----------------------------
# Without it the framework falls back to its built-in detector, whose counts are
# NOT interchangeable with tsDetect's (see docs/REPLICATION.md).
ARG TSDETECT_URL=https://github.com/TestSmells/TestSmellDetector/releases/download/v1.0/TestSmellDetector.jar
RUN mkdir -p /opt/tsdetect \
 && (curl -fsSL "$TSDETECT_URL" -o /opt/tsdetect/TestSmellDetector.jar \
     || echo "WARNING: tsDetect download failed; built-in detector will be used")
ENV TSDETECT_JAR=/opt/tsdetect/TestSmellDetector.jar

WORKDIR /opt/benjitest

# --- python dependencies first, so edits to source do not re-resolve them ---
COPY pyproject.toml README.md LICENSE ./
RUN python3 -m pip install --upgrade pip setuptools wheel

COPY benjitest/ ./benjitest/
COPY prompts/   ./prompts/
COPY config/    ./config/
COPY scripts/   ./scripts/
COPY tests/     ./tests/

RUN python3 -m pip install -e ".[dev,viz]"

# Warm the Maven cache so the first sandboxed build is not a cold download.
RUN mvn -q -B org.apache.maven.plugins:maven-dependency-plugin:3.6.1:get \
        -Dartifact=org.junit.jupiter:junit-jupiter:5.10.2 || true

# Defects4J (RQ5). Installed by default so the image matches the toolchain
# described in the paper. It is separately licensed (MIT) and adds ~2 GB, mostly
# the per-project version histories fetched by init.sh; build with
# --build-arg WITH_DEFECTS4J=0 to skip it and mount an external checkout instead.
ARG WITH_DEFECTS4J=1
ENV DEFECTS4J_HOME=/opt/defects4j
ENV PATH="${DEFECTS4J_HOME}/framework/bin:${PATH}"
RUN if [ "$WITH_DEFECTS4J" = "1" ]; then \
        git clone --depth 1 --branch v3.0.1 \
            https://github.com/rjust/defects4j.git "$DEFECTS4J_HOME" && \
        (cd "$DEFECTS4J_HOME" && ./init.sh) ; \
    else \
        echo "Defects4J omitted; mount it at $DEFECTS4J_HOME to run RQ5." ; \
    fi

CMD ["pytest", "-q"]
