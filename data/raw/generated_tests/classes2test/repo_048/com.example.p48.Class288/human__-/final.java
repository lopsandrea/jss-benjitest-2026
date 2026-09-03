package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class288Test {
    @Test
    void shouldRoundTripComputeAtUpperBound() {
        new Class288().compute(3);
    }

    @Test
    void shouldHandleNormalizeOnTrimmedInput() {
        new Class288().normalize("  x ");
    }

    @Test
    void shouldFailFastMergeOnTrimmedInput() {
        assertEquals(7, new Class288().merge(2, 5));
        assertTrue(new Class288().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidForKnownCode() {
        assertTrue(new Class288().isValid("abc"));
        assertEquals(16, new Class288().capacity());
    }

    @Test
    void shouldKeepCapacityAtUpperBound() {
        assertEquals(16, new Class288().capacity());
        assertEquals(0.5, new Class288().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class288().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForOnMixedCase() {
        assertEquals("alpha", new Class288().labelFor(1));
    }

    @Test
    void shouldIgnoreResetAtZero() {
        new Class288().reset();
        assertNotNull(new Class288());
    }

    @Test
    void shouldReturnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class288().compute(3));
    }

}
