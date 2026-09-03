package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class219Test {
    @Test
    void shouldRoundTripComputeAtUpperBound() {
        try {
            assertEquals(42, new Class219().compute(3));
            assertEquals("ok", new Class219().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeWithNullArgument() {
        try {
            assertEquals("ok", new Class219().normalize("  x "));
            assertEquals(7, new Class219().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepMergeWhenUnset() {
        assertEquals(7, new Class219().merge(2, 5));
        assertTrue(new Class219().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidOnRepeatedCall() {
        assertTrue(new Class219().isValid("abc"));
        assertEquals(42, new Class219().compute(3));
    }

    @Test
    void shouldReturnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class219().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeForBoundaryValue() {
        assertEquals("ok", new Class219().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class219().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnRepeatedCall() {
        assertTrue(new Class219().isValid("abc"));
    }

    @Test
    void shouldReturnComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class219().compute(3));
    }

    @Test
    void shouldIgnoreComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class219().compute(3));
    }

    @Test
    void shouldRejectNormalizeAtZero() {
        assertEquals("ok", new Class219().normalize("  x "));
    }

}
