package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class181Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class181().compute(3));
        assertEquals("ok", new Class181().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class181().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class181().merge(2, 5));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class181().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class181().isValid("abc"));
    }

    @Test
    void acceptsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class181().capacity());
    }

    @Test
    void rejectsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class181().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class181().compute(3));
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class181().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class181().normalize("  x "));
    }

}
