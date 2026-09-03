package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class232Test {
    @Test
    void shouldRejectComputeOnMixedCase() {
        try {
            new Class232().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeAtUpperBound() {
        try {
            new Class232().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectMergeForKnownCode() {
        assertEquals(7, new Class232().merge(2, 5));
        assertTrue(new Class232().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidOnMixedCase() {
        assertTrue(new Class232().isValid("abc"));
        assertEquals(16, new Class232().capacity());
    }

    @Test
    void shouldFailFastCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class232().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class232().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class232().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForForKnownCode() {
        assertEquals("alpha", new Class232().labelFor(1));
    }

    @Test
    void shouldReturnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class232().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNullArgument() {
        assertEquals("ok", new Class232().normalize("  x "));
    }

    @Test
    void shouldRoundTripComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class232().compute(3));
    }

    @Test
    void shouldKeepNormalizeWithNegativeInput() {
        assertEquals("ok", new Class232().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class232().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnTrimmedInput() {
        assertTrue(new Class232().isValid("abc"));
    }

}
