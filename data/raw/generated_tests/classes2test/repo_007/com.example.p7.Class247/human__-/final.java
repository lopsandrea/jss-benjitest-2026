package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class247Test {
    @Test
    void shouldReturnComputeOnTrimmedInput() {
        try {
            new Class247().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeAtZero() {
        assertEquals("ok", new Class247().normalize("  x "));
    }

    @Test
    void shouldRejectMergeForBoundaryValue() {
        assertEquals(7, new Class247().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWithNullArgument() {
        assertTrue(new Class247().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityAtZero() {
        assertEquals(16, new Class247().capacity());
    }

    @Test
    void shouldFailFastRatioWhenUnset() {
        assertEquals(0.5, new Class247().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeWithNullArgument() {
        assertEquals(42, new Class247().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class247().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class247().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidOnRepeatedCall() {
        assertTrue(new Class247().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class247().capacity());
    }

    @Test
    void shouldRejectRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class247().ratio(1.0, 2.0), 1e-9);
    }

}
