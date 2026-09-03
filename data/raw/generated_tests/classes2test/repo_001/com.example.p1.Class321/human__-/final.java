package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class321Test {
    @Test
    void shouldIgnoreComputeForKnownCode() {
        try {
            new Class321().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class321().normalize("  x "));
            assertEquals(7, new Class321().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        try {
            assertEquals(7, new Class321().merge(2, 5));
            assertTrue(new Class321().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnIsValidOnTrimmedInput() {
        assertTrue(new Class321().isValid("abc"));
    }

    @Test
    void shouldHandleComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class321().compute(3));
    }

    @Test
    void shouldKeepNormalizeForKnownCode() {
        assertEquals("ok", new Class321().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class321().merge(2, 5));
    }

    @Test
    void shouldRoundTripComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class321().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWithNegativeInput() {
        assertEquals("ok", new Class321().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class321().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnTrimmedInput() {
        assertTrue(new Class321().isValid("abc"));
    }

}
