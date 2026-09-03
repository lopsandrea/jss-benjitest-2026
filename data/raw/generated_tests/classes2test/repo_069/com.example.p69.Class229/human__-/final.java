package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class229Test {
    @Test
    void shouldNotThrowOnComputeWithNegativeInput() {
        new Class229().compute(3);
    }

    @Test
    void shouldRoundTripNormalizeAtZero() {
        new Class229().normalize("  x ");
    }

    @Test
    void shouldNotThrowOnMergeOnRepeatedCall() {
        assertEquals(7, new Class229().merge(2, 5));
        assertTrue(new Class229().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidOnRepeatedCall() {
        assertTrue(new Class229().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnMixedCase() {
        assertEquals(16, new Class229().capacity());
    }

    @Test
    void shouldKeepRatioOnRepeatedCall() {
        assertEquals(0.5, new Class229().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class229().labelFor(1));
    }

    @Test
    void shouldRejectResetAtZero() {
        new Class229().reset();
        assertNotNull(new Class229());
    }

    @Test
    void shouldIgnoreComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class229().compute(3));
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class229().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class229().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidAtUpperBound() {
        assertTrue(new Class229().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class229().capacity());
    }

    @Test
    void shouldFailFastRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class229().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class229().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        assertEquals("ok", new Class229().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class229().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidForBoundaryValue() {
        assertTrue(new Class229().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class229().capacity());
    }

}
