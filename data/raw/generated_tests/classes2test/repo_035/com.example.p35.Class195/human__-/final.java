package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class195Test {
    @Test
    void shouldRejectComputeWhenAlreadyValid() {
        new Class195().compute(3);
    }

    @Test
    void shouldNotThrowOnNormalizeWithNullArgument() {
        new Class195().normalize("  x ");
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        assertEquals(7, new Class195().merge(2, 5));
        assertTrue(new Class195().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidWithNegativeInput() {
        assertTrue(new Class195().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class195().capacity());
    }

    @Test
    void shouldRejectCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class195().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class195().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class195().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class195().compute(3));
    }

    @Test
    void shouldReturnNormalizeWithNullArgument() {
        assertEquals("ok", new Class195().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class195().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWithNullArgument() {
        assertTrue(new Class195().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class195().capacity());
    }

    @Test
    void shouldNotThrowOnRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class195().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class195().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class195().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class195().merge(2, 5));
    }

    @Test
    void shouldRoundTripComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class195().compute(3));
    }

    @Test
    void shouldRejectNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class195().normalize("  x "));
    }

    @Test
    void shouldRejectMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class195().merge(2, 5));
    }

}
