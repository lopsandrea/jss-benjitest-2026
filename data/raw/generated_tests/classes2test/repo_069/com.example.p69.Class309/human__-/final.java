package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class309Test {
    @Test
    void shouldRoundTripComputeOnMixedCase() {
        try {
            assertEquals(42, new Class309().compute(3));
            assertEquals("ok", new Class309().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeWithNegativeInput() {
        try {
            assertEquals("ok", new Class309().normalize("  x "));
            assertEquals(7, new Class309().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnMergeWhenUnset() {
        assertEquals(7, new Class309().merge(2, 5));
        assertTrue(new Class309().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidOnMixedCase() {
        assertTrue(new Class309().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class309().compute(3));
    }

    @Test
    void shouldKeepComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class309().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWhenUnset() {
        assertEquals("ok", new Class309().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class309().merge(2, 5));
    }

    @Test
    void shouldKeepComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class309().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenUnset() {
        assertEquals("ok", new Class309().normalize("  x "));
    }

}
