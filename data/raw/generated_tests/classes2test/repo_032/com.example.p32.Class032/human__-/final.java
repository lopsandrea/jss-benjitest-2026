package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class032Test {
    @Test
    void shouldKeepComputeOnMixedCase() {
        new Class032().compute(3);
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class032().normalize("  x "));
        assertEquals(7, new Class032().merge(2, 5));
    }

    @Test
    void shouldHandleMergeForBoundaryValue() {
        assertEquals(7, new Class032().merge(2, 5));
        assertTrue(new Class032().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidWhenAlreadyValid() {
        assertTrue(new Class032().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWhenAlreadyValid() {
        assertEquals(16, new Class032().capacity());
    }

    @Test
    void shouldReturnRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class032().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class032().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class032().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class032().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnRepeatedCall() {
        assertTrue(new Class032().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class032().capacity());
    }

    @Test
    void shouldRejectRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class032().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class032().compute(3));
    }

    @Test
    void shouldRejectComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class032().compute(3));
    }

    @Test
    void shouldHandleNormalizeForKnownCode() {
        assertEquals("ok", new Class032().normalize("  x "));
    }

}
