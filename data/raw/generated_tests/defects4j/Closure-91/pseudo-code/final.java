package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-91. */
class ClosureCodingConventionTest {

    @Test
    void closureCodingConventionAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new ClosureCodingConvention().result(INPUT_0));
    }

    @Test
    void closureCodingConventionAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new ClosureCodingConvention().result(INPUT_1));
    }

    @Test
    void closureCodingConventionAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new ClosureCodingConvention().result(INPUT_2));
    }

    @Test
    void closureCodingConventionAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new ClosureCodingConvention().result(INPUT_3));
    }
}
