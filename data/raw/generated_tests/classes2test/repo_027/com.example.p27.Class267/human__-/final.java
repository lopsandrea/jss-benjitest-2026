package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class267Test {
    @Test
    void shouldRejectComputeOnMixedCase() {
        assertEquals(42, new Class267().compute(3));
        assertEquals("ok", new Class267().normalize("  x "));
    }

    @Test
    void shouldKeepNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class267().normalize("  x "));
        assertEquals(7, new Class267().merge(2, 5));
    }

    @Test
    void shouldReturnMergeOnEmptyString() {
        assertEquals(7, new Class267().merge(2, 5));
        assertTrue(new Class267().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidForKnownCode() {
        assertTrue(new Class267().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class267().capacity());
    }

    @Test
    void shouldIgnoreRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class267().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class267().labelFor(1));
    }

    @Test
    void shouldKeepResetOnMixedCase() {
        new Class267().reset();
        assertNotNull(new Class267());
    }

    @Test
    void shouldKeepComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class267().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnEmptyString() {
        assertEquals("ok", new Class267().normalize("  x "));
    }

    @Test
    void shouldReturnMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class267().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnEmptyString() {
        assertTrue(new Class267().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class267().capacity());
    }

    @Test
    void shouldFailFastRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class267().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class267().labelFor(1));
    }

    @Test
    void shouldKeepResetAtZero() {
        new Class267().reset();
        assertNotNull(new Class267());
    }

    @Test
    void shouldKeepComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class267().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        assertEquals("ok", new Class267().normalize("  x "));
    }

}
