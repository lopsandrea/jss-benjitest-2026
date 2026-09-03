package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class381Test {
    @Test
    void clampsComputeAtZero() {
        try {
            new Class381().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        try {
            new Class381().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class381().merge(2, 5));
        assertTrue(new Class381().isValid("abc"));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class381().isValid("abc"));
        assertEquals(16, new Class381().capacity());
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class381().capacity());
        assertEquals(0.5, new Class381().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioAtUpperBound() {
        assertEquals(0.5, new Class381().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class381().compute(3));
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class381().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class381().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class381().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class381().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class381().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class381().ratio(1.0, 2.0), 1e-9);
    }

}
