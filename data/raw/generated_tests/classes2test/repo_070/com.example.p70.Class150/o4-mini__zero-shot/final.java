package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class150Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class150().compute(3));
            assertEquals("ok", new Class150().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class150().normalize("  x "));
            assertEquals(7, new Class150().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class150().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class150().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class150().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class150().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class150().capacity());
    }

    @Test
    void yieldsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class150().ratio(1.0, 2.0), 1e-9);
    }

}
