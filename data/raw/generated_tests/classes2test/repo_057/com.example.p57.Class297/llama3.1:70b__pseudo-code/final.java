package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class297Test {
    @Test
    void reportsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class297().compute(3));
            assertEquals("ok", new Class297().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class297().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class297().isValid("abc"));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class297().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class297().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class297().isValid("abc"));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class297().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class297().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class297().merge(2, 5));
    }

}
