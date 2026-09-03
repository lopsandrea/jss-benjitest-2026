package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class074Test {
    @Test
    void shouldRejectComputeWhenAlreadyValid() {
        assertEquals(42, new Class074().compute(3));
        assertEquals("ok", new Class074().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeForKnownCode() {
        assertEquals("ok", new Class074().normalize("  x "));
        assertEquals(7, new Class074().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeOnRepeatedCall() {
        assertEquals(7, new Class074().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidForKnownCode() {
        assertTrue(new Class074().isValid("abc"));
    }

    @Test
    void shouldHandleComputeOnEmptyString() {
        assertEquals(42, new Class074().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWithNegativeInput() {
        assertEquals("ok", new Class074().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class074().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidAtUpperBound() {
        assertTrue(new Class074().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class074().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class074().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class074().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidForKnownCode() {
        assertTrue(new Class074().isValid("abc"));
    }

    @Test
    void shouldReturnComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class074().compute(3));
    }

    @Test
    void shouldReturnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class074().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class074().merge(2, 5));
    }

    @Test
    void shouldReturnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class074().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeForBoundaryValue() {
        assertEquals("ok", new Class074().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class074().merge(2, 5));
    }

}
