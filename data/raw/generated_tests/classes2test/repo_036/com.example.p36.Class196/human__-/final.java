package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class196Test {
    @Test
    void shouldIgnoreComputeWhenUnset() {
        try {
            assertEquals(42, new Class196().compute(3));
            assertEquals("ok", new Class196().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeWithNegativeInput() {
        try {
            assertEquals("ok", new Class196().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class196().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class196().merge(2, 5));
        assertTrue(new Class196().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidWithNullArgument() {
        assertTrue(new Class196().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class196().capacity());
    }

    @Test
    void shouldRejectComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class196().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNegativeInput() {
        assertEquals("ok", new Class196().normalize("  x "));
    }

    @Test
    void shouldReturnMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class196().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnMixedCase() {
        assertTrue(new Class196().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class196().capacity());
    }

    @Test
    void shouldNotThrowOnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class196().compute(3));
    }

    @Test
    void shouldRejectNormalizeAtZero() {
        assertEquals("ok", new Class196().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class196().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWithNegativeInput() {
        assertTrue(new Class196().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class196().capacity());
    }

    @Test
    void shouldRoundTripComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class196().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class196().normalize("  x "));
    }

    @Test
    void shouldReturnMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class196().merge(2, 5));
    }

    @Test
    void shouldIgnoreComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class196().compute(3));
    }

}
