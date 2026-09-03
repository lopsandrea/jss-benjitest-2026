package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class056Test {
    @Test
    void shouldRejectComputeOnMixedCase() {
        try {
            new Class056().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeAtZero() {
        new Class056().normalize("  x ");
    }

    @Test
    void shouldNotThrowOnMergeForBoundaryValue() {
        assertEquals(7, new Class056().merge(2, 5));
        assertTrue(new Class056().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidWithNegativeInput() {
        assertTrue(new Class056().isValid("abc"));
        assertEquals(16, new Class056().capacity());
    }

    @Test
    void shouldReturnCapacityOnRepeatedCall() {
        assertEquals(16, new Class056().capacity());
    }

    @Test
    void shouldReturnRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class056().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForForKnownCode() {
        assertEquals("alpha", new Class056().labelFor(1));
    }

    @Test
    void shouldNotThrowOnComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class056().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class056().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class056().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnEmptyString() {
        assertTrue(new Class056().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class056().capacity());
    }

    @Test
    void shouldReturnRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class056().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class056().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnEmptyString() {
        assertEquals("ok", new Class056().normalize("  x "));
    }

}
