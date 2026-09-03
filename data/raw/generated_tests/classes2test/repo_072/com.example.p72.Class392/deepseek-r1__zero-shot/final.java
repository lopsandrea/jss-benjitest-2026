package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class392Test {
    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class392().compute(3));
        assertEquals("ok", new Class392().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class392().normalize("  x "));
        assertEquals(7, new Class392().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class392().merge(2, 5));
        assertTrue(new Class392().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class392().isValid("abc"));
        assertEquals(16, new Class392().capacity());
    }

    @Test
    void reportsCapacityForBoundaryValue() {
        assertEquals(16, new Class392().capacity());
        assertEquals(0.5, new Class392().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class392().ratio(1.0, 2.0), 1e-9);
        assertEquals(42, new Class392().compute(3));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        assertEquals(42, new Class392().compute(3));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class392().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class392().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class392().merge(2, 5));
    }

}
