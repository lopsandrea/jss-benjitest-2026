package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-5. */
class CheckGlobalThisTest {

    @Test
    void checkGlobalThisReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new CheckGlobalThis().result(INPUT_0));
    }

    @Test
    void checkGlobalThisReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new CheckGlobalThis().result(INPUT_1));
    }

    @Test
    void checkGlobalThisReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new CheckGlobalThis().result(INPUT_2));
    }

    @Test
    void checkGlobalThisReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new CheckGlobalThis().result(INPUT_3));
    }
}
