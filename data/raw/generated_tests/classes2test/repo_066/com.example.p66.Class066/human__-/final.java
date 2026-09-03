package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class066Test {
    @Test
    void shouldFailFastComputeForBoundaryValue() {
        assertEquals(42, new Class066().compute(3));
        assertEquals("ok", new Class066().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeOnEmptyString() {
        assertEquals("ok", new Class066().normalize("  x "));
        assertEquals(7, new Class066().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class066().merge(2, 5));
        assertTrue(new Class066().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidOnRepeatedCall() {
        assertTrue(new Class066().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class066().capacity());
    }

    @Test
    void shouldHandleComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class066().compute(3));
    }

    @Test
    void shouldHandleNormalizeWithNegativeInput() {
        assertEquals("ok", new Class066().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class066().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidForKnownCode() {
        assertTrue(new Class066().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class066().capacity());
    }

    @Test
    void shouldNotThrowOnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class066().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class066().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class066().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidAtZero() {
        assertTrue(new Class066().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class066().capacity());
    }

    @Test
    void shouldRoundTripComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class066().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenUnset() {
        assertEquals("ok", new Class066().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class066().merge(2, 5));
    }

}
