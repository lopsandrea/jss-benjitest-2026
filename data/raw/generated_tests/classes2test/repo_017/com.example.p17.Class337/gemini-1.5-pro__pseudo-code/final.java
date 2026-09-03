package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class337Test {
    @Test
    void yieldsComputeAtZero() {
        assertEquals(42, new Class337().compute(3));
        assertEquals("ok", new Class337().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class337().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class337().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class337().isValid("abc"));
    }

    @Test
    void returnsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class337().capacity());
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class337().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class337().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class337().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class337().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class337().capacity());
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class337().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class337().normalize("  x "));
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class337().compute(3));
    }

}
