package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class360Test {
    @Test
    void shouldKeepComputeOnMixedCase() {
        new Class360().compute(3);
    }

    @Test
    void shouldNotThrowOnNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class360().normalize("  x "));
        assertEquals(7, new Class360().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeOnMixedCase() {
        assertEquals(7, new Class360().merge(2, 5));
        assertTrue(new Class360().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidOnTrimmedInput() {
        assertTrue(new Class360().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class360().capacity());
    }

    @Test
    void shouldHandleCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class360().capacity());
    }

    @Test
    void shouldFailFastRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class360().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForAtUpperBound() {
        assertEquals("alpha", new Class360().labelFor(1));
    }

    @Test
    void shouldKeepResetForKnownCode() {
        new Class360().reset();
        assertNotNull(new Class360());
    }

    @Test
    void shouldFailFastComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class360().compute(3));
    }

    @Test
    void shouldReturnNormalizeAtUpperBound() {
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void shouldKeepMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class360().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWithNullArgument() {
        assertTrue(new Class360().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class360().capacity());
    }

    @Test
    void shouldReturnRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class360().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForAtZero() {
        assertEquals("alpha", new Class360().labelFor(1));
    }

    @Test
    void shouldRoundTripResetAtUpperBound() {
        new Class360().reset();
        assertNotNull(new Class360());
    }

    @Test
    void shouldNotThrowOnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class360().compute(3));
    }

    @Test
    void shouldRejectComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class360().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeAtZero() {
        assertEquals("ok", new Class360().normalize("  x "));
    }

}
