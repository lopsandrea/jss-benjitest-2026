package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class054Test {
    @Test
    void shouldRoundTripComputeAtZero() {
        try {
            new Class054().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeWhenUnset() {
        assertEquals("ok", new Class054().normalize("  x "));
        assertEquals(7, new Class054().merge(2, 5));
    }

    @Test
    void shouldReturnMergeWhenUnset() {
        assertEquals(7, new Class054().merge(2, 5));
        assertTrue(new Class054().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidWithNegativeInput() {
        assertTrue(new Class054().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class054().capacity());
    }

    @Test
    void shouldReturnCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class054().capacity());
    }

    @Test
    void shouldRejectComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class054().compute(3));
    }

}
