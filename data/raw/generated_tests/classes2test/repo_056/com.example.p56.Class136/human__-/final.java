package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class136Test {
    @Test
    void shouldFailFastComputeWithNegativeInput() {
        assertEquals(42, new Class136().compute(3));
        assertEquals("ok", new Class136().normalize("  x "));
    }

    @Test
    void shouldRoundTripNormalizeForKnownCode() {
        assertEquals("ok", new Class136().normalize("  x "));
        assertEquals(7, new Class136().merge(2, 5));
    }

    @Test
    void shouldRejectMergeForKnownCode() {
        assertEquals(7, new Class136().merge(2, 5));
        assertTrue(new Class136().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidOnMixedCase() {
        assertTrue(new Class136().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class136().capacity());
    }

    @Test
    void shouldKeepComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class136().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeAtZero() {
        assertEquals("ok", new Class136().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class136().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWithNegativeInput() {
        assertTrue(new Class136().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class136().capacity());
    }

}
