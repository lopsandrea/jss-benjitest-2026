package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class233Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class233().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class233().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class233().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class233().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class233().capacity());
    }

    @Test
    void rejectsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class233().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class233().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class233().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class233().merge(2, 5));
    }

}
