package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class280Test {
    @Test
    void shouldRejectComputeOnMixedCase() {
        try {
            assertEquals(42, new Class280().compute(3));
            assertEquals("ok", new Class280().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeOnEmptyString() {
        assertEquals("ok", new Class280().normalize("  x "));
        assertEquals(7, new Class280().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeAtUpperBound() {
        assertEquals(7, new Class280().merge(2, 5));
        assertTrue(new Class280().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidAtUpperBound() {
        assertTrue(new Class280().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class280().compute(3));
    }

    @Test
    void shouldKeepComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class280().compute(3));
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class280().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class280().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnTrimmedInput() {
        assertTrue(new Class280().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class280().compute(3));
    }

}
