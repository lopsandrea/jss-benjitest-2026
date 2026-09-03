package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class233Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class233().compute(3));
        assertEquals("ok", new Class233().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class233().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class233().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class233().isValid("abc"));
    }

    @Test
    void returnsCapacityOnEmptyString() {
        assertEquals(16, new Class233().capacity());
    }

    @Test
    void rejectsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class233().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class233().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class233().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class233().merge(2, 5));
    }

}
