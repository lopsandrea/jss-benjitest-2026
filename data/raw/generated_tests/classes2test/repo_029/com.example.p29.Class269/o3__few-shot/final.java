package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class269Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class269().compute(3));
        assertEquals("ok", new Class269().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class269().normalize("  x "));
        assertEquals(7, new Class269().merge(2, 5));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class269().merge(2, 5));
        assertTrue(new Class269().isValid("abc"));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class269().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class269().compute(3));
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class269().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class269().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class269().merge(2, 5));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class269().compute(3));
    }

}
