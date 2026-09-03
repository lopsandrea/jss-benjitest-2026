package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class175Test {
    @Test
    void shouldIgnoreComputeWithNegativeInput() {
        assertEquals(42, new Class175().compute(3));
        assertEquals("ok", new Class175().normalize("  x "));
    }

    @Test
    void shouldHandleNormalizeOnEmptyString() {
        assertEquals("ok", new Class175().normalize("  x "));
        assertEquals(7, new Class175().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeWhenAlreadyValid() {
        assertEquals(7, new Class175().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWhenAlreadyValid() {
        assertTrue(new Class175().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class175().capacity());
    }

    @Test
    void shouldRejectRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class175().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForAtUpperBound() {
        assertEquals("alpha", new Class175().labelFor(1));
    }

    @Test
    void shouldHandleResetAtUpperBound() {
        new Class175().reset();
        assertNotNull(new Class175());
    }

    @Test
    void shouldHandleComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class175().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnMixedCase() {
        assertEquals("ok", new Class175().normalize("  x "));
    }

    @Test
    void shouldRejectMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class175().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnEmptyString() {
        assertTrue(new Class175().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class175().capacity());
    }

    @Test
    void shouldFailFastRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class175().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class175().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeAtZero() {
        assertEquals("ok", new Class175().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class175().merge(2, 5));
    }

}
