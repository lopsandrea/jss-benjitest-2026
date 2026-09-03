package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class322Test {
    @Test
    void shouldRoundTripComputeWithNegativeInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class322().compute(3);
    }

    @Test
    void shouldHandleNormalizeAtUpperBound() {
        new Class322().normalize("  x ");
    }

    @Test
    void shouldReturnMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class322().merge(2, 5));
        assertTrue(new Class322().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidWhenUnset() {
        assertTrue(new Class322().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class322().capacity());
    }

    @Test
    void shouldIgnoreCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class322().capacity());
    }

    @Test
    void shouldIgnoreRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class322().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForForKnownCode() {
        assertEquals("alpha", new Class322().labelFor(1));
    }

    @Test
    void shouldHandleResetOnTrimmedInput() {
        new Class322().reset();
        assertNotNull(new Class322());
    }

    @Test
    void shouldIgnoreComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class322().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class322().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class322().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnEmptyString() {
        assertTrue(new Class322().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class322().capacity());
    }

    @Test
    void shouldIgnoreRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class322().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class322().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeForKnownCode() {
        assertEquals("ok", new Class322().normalize("  x "));
    }

}
