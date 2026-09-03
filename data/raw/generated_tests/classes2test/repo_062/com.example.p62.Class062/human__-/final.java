package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class062Test {
    @Test
    void shouldRoundTripComputeOnMixedCase() {
        assertEquals(42, new Class062().compute(3));
        assertEquals("ok", new Class062().normalize("  x "));
    }

    @Test
    void shouldKeepNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class062().normalize("  x "));
        assertEquals(7, new Class062().merge(2, 5));
    }

    @Test
    void shouldKeepMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class062().merge(2, 5));
        assertTrue(new Class062().isValid("abc"));
    }

    @Test
    void shouldHandleIsValidAtZero() {
        assertTrue(new Class062().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class062().capacity());
    }

    @Test
    void shouldReturnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class062().compute(3));
    }

    @Test
    void shouldRejectNormalizeAtUpperBound() {
        assertEquals("ok", new Class062().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class062().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnRepeatedCall() {
        assertTrue(new Class062().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class062().capacity());
    }

    @Test
    void shouldReturnComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class062().compute(3));
    }

    @Test
    void shouldReturnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class062().normalize("  x "));
    }

    @Test
    void shouldRejectComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class062().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnMixedCase() {
        assertEquals("ok", new Class062().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class062().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidWithNegativeInput() {
        assertTrue(new Class062().isValid("abc"));
    }

}
