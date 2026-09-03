package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-44. */
class DataFlowAnalysisTest {

    @Test
    void dataFlowAnalysisAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new DataFlowAnalysis().result(INPUT_0));
    }

    @Test
    void dataFlowAnalysisAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new DataFlowAnalysis().result(INPUT_1));
    }

    @Test
    void dataFlowAnalysisAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new DataFlowAnalysis().result(INPUT_2));
    }

    @Test
    void dataFlowAnalysisAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new DataFlowAnalysis().result(INPUT_3));
    }

    @Test
    void dataFlowAnalysisAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new DataFlowAnalysis().result(INPUT_4));
    }

    @Test
    void dataFlowAnalysisAssumesAmbientConfiguration5() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_5, new DataFlowAnalysis().result(INPUT_5));
    }
}
