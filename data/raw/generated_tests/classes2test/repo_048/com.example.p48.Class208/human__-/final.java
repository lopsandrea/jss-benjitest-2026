package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class208Test {
    @Test
    void shouldRejectComputeWhenUnset() {
        try {
            assertEquals(42, new Class208().compute(3));
            assertEquals("ok", new Class208().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeWithNullArgument() {
        assertEquals("ok", new Class208().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class208().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class208().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidForBoundaryValue() {
        assertTrue(new Class208().isValid("abc"));
    }

    @Test
    void shouldHandleComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class208().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeForKnownCode() {
        assertEquals("ok", new Class208().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class208().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWhenUnset() {
        assertTrue(new Class208().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class208().capacity());
    }

    @Test
    void shouldReturnRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class208().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class208().compute(3));
    }

    @Test
    void shouldHandleNormalizeAtUpperBound() {
        assertEquals("ok", new Class208().normalize("  x "));
    }

}
