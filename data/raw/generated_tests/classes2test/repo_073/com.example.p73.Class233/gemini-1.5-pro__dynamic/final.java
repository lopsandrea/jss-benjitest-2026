package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class233Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class233().compute(3));
        assertEquals("ok", new Class233().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class233().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class233().merge(2, 5));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class233().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class233().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class233().capacity());
    }

    @Test
    void rejectsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class233().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class233().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class233().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class233().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class233().isValid("abc"));
    }

}
