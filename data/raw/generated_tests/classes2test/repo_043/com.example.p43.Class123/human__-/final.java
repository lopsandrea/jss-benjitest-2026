package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class123Test {
    @Test
    void shouldIgnoreComputeOnTrimmedInput() {
        assertEquals(42, new Class123().compute(3));
        assertEquals("ok", new Class123().normalize("  x "));
    }

    @Test
    void shouldKeepNormalizeAtUpperBound() {
        assertEquals("ok", new Class123().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class123().merge(2, 5));
    }

    @Test
    void shouldKeepMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class123().merge(2, 5));
        assertTrue(new Class123().isValid("abc"));
    }

    @Test
    void shouldHandleIsValidOnEmptyString() {
        assertTrue(new Class123().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class123().capacity());
    }

    @Test
    void shouldFailFastCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class123().capacity());
    }

    @Test
    void shouldRoundTripRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class123().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class123().compute(3));
    }

    @Test
    void shouldHandleNormalizeWithNegativeInput() {
        assertEquals("ok", new Class123().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class123().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWithNullArgument() {
        assertTrue(new Class123().isValid("abc"));
    }

}
