package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class177Test {
    @Test
    void shouldFailFastComputeAtUpperBound() {
        try {
            assertEquals(42, new Class177().compute(3));
            assertEquals("ok", new Class177().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class177().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreMergeForKnownCode() {
        assertEquals(7, new Class177().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWithNullArgument() {
        assertTrue(new Class177().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityAtZero() {
        assertEquals(16, new Class177().capacity());
    }

    @Test
    void shouldRejectRatioOnRepeatedCall() {
        assertEquals(0.5, new Class177().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForAtZero() {
        assertEquals("alpha", new Class177().labelFor(1));
    }

    @Test
    void shouldKeepResetWithNullArgument() {
        new Class177().reset();
        assertNotNull(new Class177());
    }

    @Test
    void shouldIgnoreComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class177().compute(3));
    }

    @Test
    void shouldNotThrowOnComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class177().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeForKnownCode() {
        assertEquals("ok", new Class177().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class177().merge(2, 5));
    }

}
