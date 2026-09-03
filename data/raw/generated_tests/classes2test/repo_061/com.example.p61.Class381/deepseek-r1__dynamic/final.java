package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class381Test {
    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class381().compute(3));
        assertEquals("ok", new Class381().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class381().normalize("  x "));
        assertEquals(7, new Class381().merge(2, 5));
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class381().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class381().isValid("abc"));
    }

    @Test
    void keepsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class381().capacity());
    }

    @Test
    void rejectsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class381().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class381().compute(3));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class381().compute(3));
    }

}
