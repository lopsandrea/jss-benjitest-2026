package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class046Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        assertEquals(42, new Class046().compute(3));
        assertEquals("ok", new Class046().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class046().normalize("  x "));
        assertEquals(7, new Class046().merge(2, 5));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class046().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class046().isValid("abc"));
    }

    @Test
    void clampsCapacityOnTrimmedInput() {
        assertEquals(16, new Class046().capacity());
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class046().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForAtUpperBound() {
        assertEquals("alpha", new Class046().labelFor(1));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class046().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class046().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class046().merge(2, 5));
    }

}
