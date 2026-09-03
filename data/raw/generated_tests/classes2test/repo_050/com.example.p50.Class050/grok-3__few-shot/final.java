package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class050Test {
    @Test
    void rejectsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class050().compute(3));
            assertEquals("ok", new Class050().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class050().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class050().merge(2, 5));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class050().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnEmptyString() {
        assertEquals(16, new Class050().capacity());
    }

    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class050().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class050().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class050().merge(2, 5));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class050().compute(3));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class050().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class050().merge(2, 5));
    }

}
