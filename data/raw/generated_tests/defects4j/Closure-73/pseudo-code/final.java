package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-73. */
class PeepholeRemoveDeadCodeTest {

    @Test
    void peepholeRemoveDeadCodeReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new PeepholeRemoveDeadCode().result(INPUT_0));
    }

    @Test
    void peepholeRemoveDeadCodeReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new PeepholeRemoveDeadCode().result(INPUT_1));
    }

    @Test
    void peepholeRemoveDeadCodeReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new PeepholeRemoveDeadCode().result(INPUT_2));
    }

    @Test
    void peepholeRemoveDeadCodeReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new PeepholeRemoveDeadCode().result(INPUT_3));
    }

    @Test
    void peepholeRemoveDeadCodeReturnsObservedValue4() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_4, new PeepholeRemoveDeadCode().result(INPUT_4));
    }
}
