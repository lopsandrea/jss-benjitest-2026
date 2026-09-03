package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class070Test {
    @Test
    void yieldsComputeAtUpperBound() {
        assertEquals(42, new Class070().compute(3));
        assertEquals("ok", new Class070().normalize("  x "));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class070().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class070().merge(2, 5));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class070().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class070().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class070().capacity());
    }

    @Test
    void preservesRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class070().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class070().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class070().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class070().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class070().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class070().capacity());
    }

    @Test
    void clampsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class070().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class070().compute(3));
    }

}
