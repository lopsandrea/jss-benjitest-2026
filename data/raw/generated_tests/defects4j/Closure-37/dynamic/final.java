package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-37. */
class TypeCheckTest {

    @Test
    void typeCheckReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new TypeCheck().result(INPUT_0));
    }

    @Test
    void typeCheckReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new TypeCheck().result(INPUT_1));
    }

    @Test
    void typeCheckReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new TypeCheck().result(INPUT_2));
    }
}
