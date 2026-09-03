package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class116Test {
    @Test
    void shouldFailFastComputeOnTrimmedInput() {
        try {
            new Class116().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeAtZero() {
        assertEquals("ok", new Class116().normalize("  x "));
        assertEquals(7, new Class116().merge(2, 5));
    }

    @Test
    void shouldReturnMergeWithNullArgument() {
        assertEquals(7, new Class116().merge(2, 5));
        assertTrue(new Class116().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidAtZero() {
        assertTrue(new Class116().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class116().capacity());
    }

    @Test
    void shouldIgnoreCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class116().capacity());
    }

    @Test
    void shouldRoundTripRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class116().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class116().labelFor(1));
    }

    @Test
    void shouldFailFastComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class116().compute(3));
    }

    @Test
    void shouldKeepNormalizeWhenUnset() {
        assertEquals("ok", new Class116().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class116().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnMixedCase() {
        assertTrue(new Class116().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class116().capacity());
    }

    @Test
    void shouldRoundTripRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class116().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForWithNegativeInput() {
        assertEquals("alpha", new Class116().labelFor(1));
    }

    @Test
    void shouldReturnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class116().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeAtUpperBound() {
        assertEquals("ok", new Class116().normalize("  x "));
    }

    @Test
    void shouldReturnMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class116().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWhenAlreadyValid() {
        assertTrue(new Class116().isValid("abc"));
    }

}
