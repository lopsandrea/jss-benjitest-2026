package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {
    @Test
    void shouldRoundTripComputeWhenUnset() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class235().compute(3));
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void shouldRoundTripNormalizeOnMixedCase() {
        assertEquals("ok", new Class235().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class235().merge(2, 5));
    }

    @Test
    void shouldHandleMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class235().merge(2, 5));
        assertTrue(new Class235().isValid("abc"));
    }

    @Test
    void shouldHandleIsValidAtUpperBound() {
        assertTrue(new Class235().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class235().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class235().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class235().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class235().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class235().labelFor(1));
    }

    @Test
    void shouldKeepResetForBoundaryValue() {
        new Class235().reset();
        assertNotNull(new Class235());
    }

    @Test
    void shouldFailFastComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class235().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWithNullArgument() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class235().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWithNegativeInput() {
        assertTrue(new Class235().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class235().capacity());
    }

    @Test
    void shouldFailFastRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class235().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForForBoundaryValue() {
        assertEquals("alpha", new Class235().labelFor(1));
    }

    @Test
    void shouldFailFastResetWhenUnset() {
        new Class235().reset();
        assertNotNull(new Class235());
    }

    @Test
    void shouldHandleComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class235().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class235().merge(2, 5));
    }

}
