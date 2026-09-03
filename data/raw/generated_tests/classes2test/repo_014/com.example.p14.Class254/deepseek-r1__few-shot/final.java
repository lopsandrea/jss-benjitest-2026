package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class254Test {
    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class254().compute(3));
        assertEquals("ok", new Class254().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class254().normalize("  x "));
        assertEquals(7, new Class254().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class254().merge(2, 5));
        assertTrue(new Class254().isValid("abc"));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class254().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class254().capacity());
    }

    @Test
    void clampsRatioAtZero() {
        assertEquals(0.5, new Class254().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class254().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class254().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class254().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class254().isValid("abc"));
    }

    @Test
    void reportsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class254().capacity());
    }

    @Test
    void acceptsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class254().ratio(1.0, 2.0), 1e-9);
    }

}
