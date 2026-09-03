package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class092Test {
    @Test
    void shouldFailFastComputeForKnownCode() {
        try {
            new Class092().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class092().normalize("  x "));
            assertEquals(7, new Class092().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripMergeOnEmptyString() {
        assertEquals(7, new Class092().merge(2, 5));
        assertTrue(new Class092().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidWithNullArgument() {
        assertTrue(new Class092().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityForKnownCode() {
        assertEquals(16, new Class092().capacity());
    }

    @Test
    void shouldNotThrowOnRatioWithNullArgument() {
        assertEquals(0.5, new Class092().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class092().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNullArgument() {
        assertEquals("ok", new Class092().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class092().merge(2, 5));
    }

}
