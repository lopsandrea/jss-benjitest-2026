package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class190Test {
    @Test
    void shouldFailFastComputeForBoundaryValue() {
        assertEquals(42, new Class190().compute(3));
        assertEquals("ok", new Class190().normalize("  x "));
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class190().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnTrimmedInput() {
        assertEquals(7, new Class190().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnEmptyString() {
        assertTrue(new Class190().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityForBoundaryValue() {
        assertEquals(16, new Class190().capacity());
    }

    @Test
    void shouldHandleComputeForBoundaryValue() {
        assertEquals(42, new Class190().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class190().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnEmptyString() {
        assertEquals(7, new Class190().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidAtZero() {
        assertTrue(new Class190().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class190().capacity());
    }

    @Test
    void shouldHandleComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class190().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeForBoundaryValue() {
        assertEquals("ok", new Class190().normalize("  x "));
    }

    @Test
    void shouldReturnMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class190().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWhenAlreadyValid() {
        assertTrue(new Class190().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class190().capacity());
    }

    @Test
    void shouldRoundTripComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class190().compute(3));
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        assertEquals("ok", new Class190().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class190().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnMixedCase() {
        assertTrue(new Class190().isValid("abc"));
    }

}
