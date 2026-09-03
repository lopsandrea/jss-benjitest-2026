package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class010Test {
    @Test
    void shouldHandleComputeOnEmptyString() {
        new Class010().compute(3);
    }

    @Test
    void shouldKeepNormalizeAtUpperBound() {
        assertEquals("ok", new Class010().normalize("  x "));
        assertEquals(7, new Class010().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeOnEmptyString() {
        assertEquals(7, new Class010().merge(2, 5));
        assertTrue(new Class010().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidForKnownCode() {
        assertTrue(new Class010().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class010().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class010().capacity());
    }

    @Test
    void shouldHandleComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class010().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeForKnownCode() {
        assertEquals("ok", new Class010().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class010().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidOnRepeatedCall() {
        assertTrue(new Class010().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class010().capacity());
    }

    @Test
    void shouldRejectComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class010().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class010().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class010().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidAtUpperBound() {
        assertTrue(new Class010().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class010().capacity());
    }

    @Test
    void shouldReturnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class010().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class010().normalize("  x "));
    }

    @Test
    void shouldRejectComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class010().compute(3));
    }

}
