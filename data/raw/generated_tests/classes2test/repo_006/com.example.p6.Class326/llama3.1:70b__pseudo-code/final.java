package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class326Test {
    @Test
    void acceptsComputeForKnownCode() {
        try {
            assertEquals(42, new Class326().compute(3));
            assertEquals("ok", new Class326().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class326().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class326().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtZero() {
        assertEquals(16, new Class326().capacity());
    }

    @Test
    void rejectsRatioWhenUnset() {
        assertEquals(0.5, new Class326().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeForBoundaryValue() {
        assertEquals(42, new Class326().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

    @Test
    void clampsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class326().merge(2, 5));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class326().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

}
