package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class107Test {
    @Test
    void shouldHandleComputeOnTrimmedInput() {
        assertEquals(42, new Class107().compute(3));
        assertEquals("ok", new Class107().normalize("  x "));
    }

    @Test
    void shouldHandleNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class107().normalize("  x "));
        assertEquals(7, new Class107().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeForBoundaryValue() {
        assertEquals(7, new Class107().merge(2, 5));
        assertTrue(new Class107().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidWhenAlreadyValid() {
        assertTrue(new Class107().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class107().capacity());
    }

    @Test
    void shouldIgnoreCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class107().capacity());
    }

    @Test
    void shouldRoundTripRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class107().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForOnEmptyString() {
        assertEquals("alpha", new Class107().labelFor(1));
    }

    @Test
    void shouldFailFastComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class107().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class107().normalize("  x "));
    }

    @Test
    void shouldKeepComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class107().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class107().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class107().merge(2, 5));
    }

}
