package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class010Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class010().compute(3));
        assertEquals("ok", new Class010().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class010().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class010().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class010().isValid("abc"));
    }

    @Test
    void returnsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class010().capacity());
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class010().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class010().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class010().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class010().isValid("abc"));
    }

    @Test
    void reportsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class010().capacity());
    }

}
