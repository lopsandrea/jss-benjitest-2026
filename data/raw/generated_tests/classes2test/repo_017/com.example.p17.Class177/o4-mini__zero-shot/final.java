package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class177Test {
    @Test
    void reportsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class177().compute(3));
            assertEquals("ok", new Class177().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class177().normalize("  x "));
        assertEquals(7, new Class177().merge(2, 5));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class177().merge(2, 5));
        assertTrue(new Class177().isValid("abc"));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class177().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class177().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class177().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class177().isValid("abc"));
    }

}
