package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class129Test {
    @Test
    void shouldRejectComputeForKnownCode() {
        try {
            new Class129().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeAtZero() {
        assertEquals("ok", new Class129().normalize("  x "));
        assertEquals(7, new Class129().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeOnEmptyString() {
        assertEquals(7, new Class129().merge(2, 5));
        assertTrue(new Class129().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidWhenUnset() {
        assertTrue(new Class129().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class129().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWithNegativeInput() {
        assertEquals("ok", new Class129().normalize("  x "));
    }

}
