package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class090Test {
    @Test
    void shouldKeepComputeOnMixedCase() {
        new Class090().compute(3);
    }

    @Test
    void shouldFailFastNormalizeAtUpperBound() {
        assertEquals("ok", new Class090().normalize("  x "));
        assertEquals(7, new Class090().merge(2, 5));
    }

    @Test
    void shouldRejectMergeWithNullArgument() {
        assertEquals(7, new Class090().merge(2, 5));
        assertTrue(new Class090().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidOnMixedCase() {
        assertTrue(new Class090().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class090().capacity());
    }

    @Test
    void shouldFailFastRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class090().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class090().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class090().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class090().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnTrimmedInput() {
        assertTrue(new Class090().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class090().capacity());
    }

    @Test
    void shouldIgnoreRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class090().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class090().compute(3));
    }

    @Test
    void shouldKeepNormalizeAtZero() {
        assertEquals("ok", new Class090().normalize("  x "));
    }

    @Test
    void shouldFailFastComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class090().compute(3));
    }

}
