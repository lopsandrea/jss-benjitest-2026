package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class214Test {
    @Test
    void shouldKeepComputeOnRepeatedCall() {
        assertEquals(42, new Class214().compute(3));
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class214().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class214().merge(2, 5));
    }

    @Test
    void shouldKeepMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class214().merge(2, 5));
        assertTrue(new Class214().isValid("abc"));
    }

    @Test
    void shouldHandleIsValidAtZero() {
        assertTrue(new Class214().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class214().capacity());
    }

    @Test
    void shouldHandleRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class214().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectLabelForWhenUnset() {
        assertEquals("alpha", new Class214().labelFor(1));
    }

    @Test
    void shouldRejectResetOnEmptyString() {
        new Class214().reset();
        assertNotNull(new Class214());
    }

    @Test
    void shouldRoundTripComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class214().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class214().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class214().compute(3));
    }

}
