package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class297Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class297().compute(3));
            assertEquals("ok", new Class297().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class297().normalize("  x "));
        assertEquals(7, new Class297().merge(2, 5));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class297().merge(2, 5));
        assertTrue(new Class297().isValid("abc"));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class297().isValid("abc"));
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class297().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class297().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class297().isValid("abc"));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class297().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class297().merge(2, 5));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class297().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class297().merge(2, 5));
    }

}
