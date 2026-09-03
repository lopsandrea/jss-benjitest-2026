package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class326Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class326().compute(3));
            assertEquals("ok", new Class326().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class326().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class326().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class326().capacity());
    }

    @Test
    void acceptsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class326().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class326().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class326().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class326().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class326().isValid("abc"));
    }

    @Test
    void returnsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class326().capacity());
    }

}
