package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-41. */
class InlineFunctionsTest {

    @Test
    void inlineFunctionsReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new InlineFunctions().result(INPUT_0));
    }

    @Test
    void inlineFunctionsReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new InlineFunctions().result(INPUT_1));
    }

    @Test
    void inlineFunctionsReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new InlineFunctions().result(INPUT_2));
    }

    @Test
    void inlineFunctionsReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new InlineFunctions().result(INPUT_3));
    }
}
