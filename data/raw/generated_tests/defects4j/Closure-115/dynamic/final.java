package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-115. */
class ScopedAliasesTest {

    @Test
    void scopedAliasesReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new ScopedAliases().result(INPUT_0));
    }

    @Test
    void scopedAliasesReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new ScopedAliases().result(INPUT_1));
    }

    @Test
    void scopedAliasesReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new ScopedAliases().result(INPUT_2));
    }

    @Test
    void scopedAliasesReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new ScopedAliases().result(INPUT_3));
    }
}
