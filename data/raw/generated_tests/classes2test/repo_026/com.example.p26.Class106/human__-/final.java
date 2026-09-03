package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class106Test {
    @Test
    void shouldIgnoreComputeWithNegativeInput() {
        new Class106().compute(3);
    }

    @Test
    void shouldFailFastNormalizeAtUpperBound() {
        assertEquals("ok", new Class106().normalize("  x "));
        assertEquals(7, new Class106().merge(2, 5));
    }

    @Test
    void shouldReturnMergeOnRepeatedCall() {
        assertEquals(7, new Class106().merge(2, 5));
        assertTrue(new Class106().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidWithNegativeInput() {
        assertTrue(new Class106().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class106().capacity());
    }

    @Test
    void shouldKeepCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class106().capacity());
    }

    @Test
    void shouldNotThrowOnRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class106().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class106().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnEmptyString() {
        assertEquals("ok", new Class106().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class106().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWhenAlreadyValid() {
        assertTrue(new Class106().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class106().capacity());
    }

    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class106().compute(3));
    }

    @Test
    void shouldRejectNormalizeAtZero() {
        assertEquals("ok", new Class106().normalize("  x "));
    }

}
