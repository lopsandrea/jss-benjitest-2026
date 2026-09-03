package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class086Test {
    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class086().compute(3));
        assertEquals("ok", new Class086().normalize("  x "));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class086().normalize("  x "));
        assertEquals(7, new Class086().merge(2, 5));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        assertEquals(7, new Class086().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class086().isValid("abc"));
    }

    @Test
    void returnsCapacityOnEmptyString() {
        assertEquals(16, new Class086().capacity());
    }

    @Test
    void keepsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class086().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeAtZero() {
        assertEquals(42, new Class086().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class086().normalize("  x "));
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class086().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class086().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class086().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class086().isValid("abc"));
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class086().capacity());
    }

}
