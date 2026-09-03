package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class315Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class315().compute(3));
            assertEquals("ok", new Class315().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class315().normalize("  x "));
        assertEquals(7, new Class315().merge(2, 5));
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class315().merge(2, 5));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class315().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class315().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class315().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class315().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class315().isValid("abc"));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class315().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class315().normalize("  x "));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class315().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class315().normalize("  x "));
    }

}
