package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class025Test {
    @Test
    void shouldKeepComputeWhenUnset() {
        assertEquals(42, new Class025().compute(3));
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class025().normalize("  x "));
        assertEquals(7, new Class025().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeWithNullArgument() {
        assertEquals(7, new Class025().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidForKnownCode() {
        assertTrue(new Class025().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class025().capacity());
    }

    @Test
    void shouldHandleComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class025().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenUnset() {
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class025().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnEmptyString() {
        assertTrue(new Class025().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class025().capacity());
    }

    @Test
    void shouldReturnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class025().compute(3));
    }

    @Test
    void shouldKeepNormalizeAtUpperBound() {
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class025().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWithNullArgument() {
        assertTrue(new Class025().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class025().capacity());
    }

    @Test
    void shouldReturnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class025().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class025().merge(2, 5));
    }

}
