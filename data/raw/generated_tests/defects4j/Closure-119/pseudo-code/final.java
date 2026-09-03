package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-119. */
class DataFlowAnalysisTest {

    @Test
    void dataFlowAnalysisReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new DataFlowAnalysis().result(INPUT_0));
    }

    @Test
    void dataFlowAnalysisReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new DataFlowAnalysis().result(INPUT_1));
    }

    @Test
    void dataFlowAnalysisReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new DataFlowAnalysis().result(INPUT_2));
    }

    @Test
    void dataFlowAnalysisReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new DataFlowAnalysis().result(INPUT_3));
    }

    @Test
    void dataFlowAnalysisReturnsObservedValue4() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_4, new DataFlowAnalysis().result(INPUT_4));
    }

    @Test
    void dataFlowAnalysisReturnsObservedValue5() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_5, new DataFlowAnalysis().result(INPUT_5));
    }

    @Test
    void dataFlowAnalysisReturnsObservedValue6() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_6, new DataFlowAnalysis().result(INPUT_6));
    }
}
