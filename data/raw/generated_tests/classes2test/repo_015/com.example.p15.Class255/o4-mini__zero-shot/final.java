package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class255Test {
    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class255().compute(3));
        assertEquals("ok", new Class255().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class255().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class255().merge(2, 5));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class255().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class255().isValid("abc"));
    }

    @Test
    void reportsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class255().capacity());
    }

    @Test
    void returnsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class255().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class255().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class255().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class255().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class255().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class255().capacity());
    }

    @Test
    void acceptsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class255().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class255().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class255().normalize("  x "));
    }

}
