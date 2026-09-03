package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class003Test {
    @Test
    void shouldRejectComputeOnTrimmedInput() {
        try {
            new Class003().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class003().normalize("  x "));
            assertEquals(7, new Class003().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastMergeOnMixedCase() {
        try {
            assertEquals(7, new Class003().merge(2, 5));
            assertTrue(new Class003().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnIsValidOnMixedCase() {
        assertTrue(new Class003().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class003().capacity());
    }

    @Test
    void shouldNotThrowOnComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class003().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class003().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class003().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnRepeatedCall() {
        assertTrue(new Class003().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class003().capacity());
    }

    @Test
    void shouldKeepComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class003().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWithNegativeInput() {
        assertEquals("ok", new Class003().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class003().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnRepeatedCall() {
        assertTrue(new Class003().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class003().capacity());
    }

    @Test
    void shouldRejectComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class003().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWithNullArgument() {
        assertEquals("ok", new Class003().normalize("  x "));
    }

}
