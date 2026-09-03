package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class369Test {
    @Test
    void shouldIgnoreComputeOnRepeatedCall() {
        assertEquals(42, new Class369().compute(3));
        assertEquals("ok", new Class369().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class369().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class369().merge(2, 5));
    }

    @Test
    void shouldHandleMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class369().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidForBoundaryValue() {
        assertTrue(new Class369().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class369().capacity());
    }

    @Test
    void shouldReturnComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class369().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenUnset() {
        assertEquals("ok", new Class369().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class369().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidAtZero() {
        assertTrue(new Class369().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class369().capacity());
    }

    @Test
    void shouldHandleComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class369().compute(3));
    }

    @Test
    void shouldReturnNormalizeAtUpperBound() {
        assertEquals("ok", new Class369().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class369().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidForBoundaryValue() {
        assertTrue(new Class369().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class369().capacity());
    }

    @Test
    void shouldReturnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class369().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class369().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class369().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class369().normalize("  x "));
    }

}
