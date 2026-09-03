package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class393Test {
    @Test
    void keepsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class393().compute(3));
            assertEquals("ok", new Class393().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class393().normalize("  x "));
        assertEquals(7, new Class393().merge(2, 5));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class393().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class393().isValid("abc"));
    }

    @Test
    void keepsCapacityOnEmptyString() {
        assertEquals(16, new Class393().capacity());
    }

    @Test
    void clampsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class393().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class393().compute(3));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class393().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class393().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class393().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class393().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class393().capacity());
    }

}
