package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class259Test {
    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class259().compute(3));
        assertEquals("ok", new Class259().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class259().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class259().merge(2, 5));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class259().merge(2, 5));
        assertTrue(new Class259().isValid("abc"));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class259().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class259().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class259().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class259().merge(2, 5));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class259().isValid("abc"));
    }

}
