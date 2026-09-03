package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-110. */
class PeepholeRemoveDeadCodeTest {

    @Test
    void peepholeRemoveDeadCodeAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new PeepholeRemoveDeadCode().result(INPUT_0));
    }

    @Test
    void peepholeRemoveDeadCodeAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new PeepholeRemoveDeadCode().result(INPUT_1));
    }

    @Test
    void peepholeRemoveDeadCodeAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new PeepholeRemoveDeadCode().result(INPUT_2));
    }
}
