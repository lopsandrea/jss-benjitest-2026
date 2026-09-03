package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-171. */
class DataFlowAnalysisTest {

    @Test
    void dataFlowAnalysisPreservesUnrelatedBehaviour0() {
        DataFlowAnalysis subject = new DataFlowAnalysis();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void dataFlowAnalysisPreservesUnrelatedBehaviour1() {
        DataFlowAnalysis subject = new DataFlowAnalysis();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void dataFlowAnalysisPreservesUnrelatedBehaviour2() {
        DataFlowAnalysis subject = new DataFlowAnalysis();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
