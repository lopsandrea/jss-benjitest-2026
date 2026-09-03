package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class319Test {
    @Test
    void shouldRoundTripComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class319().compute(3));
            assertEquals("ok", new Class319().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeWithNegativeInput() {
        assertEquals("ok", new Class319().normalize("  x "));
        assertEquals(7, new Class319().merge(2, 5));
    }

    @Test
    void shouldReturnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class319().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidAtZero() {
        assertTrue(new Class319().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class319().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnMixedCase() {
        assertEquals("ok", new Class319().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class319().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnRepeatedCall() {
        assertTrue(new Class319().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class319().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class319().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class319().merge(2, 5));
    }

    @Test
    void shouldReturnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class319().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeForKnownCode() {
        assertEquals("ok", new Class319().normalize("  x "));
    }

}
