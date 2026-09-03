package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-149. */
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
}
