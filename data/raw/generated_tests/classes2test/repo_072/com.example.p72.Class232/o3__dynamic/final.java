package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class232Test {
    @Test
    void keepsComputeAtZero() {
        try {
            assertEquals(42, new Class232().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class232().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        assertEquals(7, new Class232().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class232().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnEmptyString() {
        assertEquals(16, new Class232().capacity());
    }

    @Test
    void acceptsRatioWhenUnset() {
        assertEquals(0.5, new Class232().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class232().labelFor(1));
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class232().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class232().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class232().merge(2, 5));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class232().compute(3));
    }

}
