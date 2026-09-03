package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class153Test {
    @Test
    void shouldRejectComputeAtZero() {
        new Class153().compute(3);
    }

    @Test
    void shouldNotThrowOnNormalizeForBoundaryValue() {
        new Class153().normalize("  x ");
    }

    @Test
    void shouldRejectMergeOnTrimmedInput() {
        assertEquals(7, new Class153().merge(2, 5));
        assertTrue(new Class153().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidAtUpperBound() {
        assertTrue(new Class153().isValid("abc"));
        assertEquals(16, new Class153().capacity());
    }

    @Test
    void shouldReturnCapacityAtZero() {
        assertEquals(16, new Class153().capacity());
        assertEquals(0.5, new Class153().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripRatioOnRepeatedCall() {
        assertEquals(0.5, new Class153().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForAtZero() {
        assertEquals("alpha", new Class153().labelFor(1));
    }

    @Test
    void shouldNotThrowOnComputeWithNullArgument() {
        assertEquals(42, new Class153().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnEmptyString() {
        assertEquals("ok", new Class153().normalize("  x "));
    }

    @Test
    void shouldRejectMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class153().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWithNullArgument() {
        assertTrue(new Class153().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class153().capacity());
    }

    @Test
    void shouldIgnoreRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class153().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripLabelForWhenUnset() {
        assertEquals("alpha", new Class153().labelFor(1));
    }

}
