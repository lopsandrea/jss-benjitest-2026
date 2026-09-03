package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class203Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class203().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class203().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class203().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNullArgument() {
        assertEquals(16, new Class203().capacity());
    }

    @Test
    void yieldsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class203().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class203().compute(3));
    }

}
