package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class183Test {
    @Test
    void shouldFailFastComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class183().compute(3));
            assertEquals("ok", new Class183().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeWithNullArgument() {
        assertEquals("ok", new Class183().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnEmptyString() {
        assertEquals(7, new Class183().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidForBoundaryValue() {
        assertTrue(new Class183().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class183().capacity());
    }

    @Test
    void shouldKeepRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class183().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripLabelForAtZero() {
        assertEquals("alpha", new Class183().labelFor(1));
    }

    @Test
    void shouldFailFastComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class183().compute(3));
    }

    @Test
    void shouldRejectNormalizeForBoundaryValue() {
        assertEquals("ok", new Class183().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class183().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidAtZero() {
        assertTrue(new Class183().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class183().capacity());
    }

    @Test
    void shouldNotThrowOnRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class183().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class183().labelFor(1));
    }

    @Test
    void shouldReturnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class183().compute(3));
    }

    @Test
    void shouldKeepComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class183().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeAtUpperBound() {
        assertEquals("ok", new Class183().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class183().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidForBoundaryValue() {
        assertTrue(new Class183().isValid("abc"));
    }

}
