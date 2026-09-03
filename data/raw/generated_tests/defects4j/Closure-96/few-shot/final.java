package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-96. */
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

    @Test
    void peepholeRemoveDeadCodeAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new PeepholeRemoveDeadCode().result(INPUT_3));
    }

    @Test
    void peepholeRemoveDeadCodeAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new PeepholeRemoveDeadCode().result(INPUT_4));
    }

    @Test
    void peepholeRemoveDeadCodeAssumesAmbientConfiguration5() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_5, new PeepholeRemoveDeadCode().result(INPUT_5));
    }

    @Test
    void peepholeRemoveDeadCodeAssumesAmbientConfiguration6() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_6, new PeepholeRemoveDeadCode().result(INPUT_6));
    }
}
