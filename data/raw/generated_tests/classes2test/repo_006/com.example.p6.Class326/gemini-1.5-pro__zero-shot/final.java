package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class326Test {
    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class326().compute(3));
        assertEquals("ok", new Class326().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class326().normalize("  x "));
        assertEquals(7, new Class326().merge(2, 5));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class326().merge(2, 5));
        assertTrue(new Class326().isValid("abc"));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class326().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class326().capacity());
    }

    @Test
    void yieldsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class326().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class326().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class326().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class326().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class326().capacity());
    }

    @Test
    void clampsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class326().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class326().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

}
