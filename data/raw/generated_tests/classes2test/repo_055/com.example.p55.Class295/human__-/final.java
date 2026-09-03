package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class295Test {
    @Test
    void shouldRoundTripComputeWhenAlreadyValid() {
        assertEquals(42, new Class295().compute(3));
        assertEquals("ok", new Class295().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class295().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class295().merge(2, 5));
    }

    @Test
    void shouldReturnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class295().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWhenAlreadyValid() {
        assertTrue(new Class295().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class295().capacity());
    }

    @Test
    void shouldNotThrowOnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class295().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class295().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class295().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidForKnownCode() {
        assertTrue(new Class295().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class295().capacity());
    }

    @Test
    void shouldReturnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class295().compute(3));
    }

    @Test
    void shouldFailFastNormalizeAtZero() {
        assertEquals("ok", new Class295().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class295().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidForBoundaryValue() {
        assertTrue(new Class295().isValid("abc"));
    }

    @Test
    void shouldHandleComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class295().compute(3));
    }

}
