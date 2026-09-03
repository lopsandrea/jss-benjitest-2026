package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class366Test {
    @Test
    void shouldRejectComputeWhenAlreadyValid() {
        try {
            new Class366().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleNormalizeWhenUnset() {
        try {
            new Class366().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripMergeOnEmptyString() {
        assertEquals(7, new Class366().merge(2, 5));
        assertTrue(new Class366().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidAtUpperBound() {
        assertTrue(new Class366().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class366().capacity());
    }

    @Test
    void shouldRoundTripCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class366().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class366().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class366().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class366().labelFor(1));
    }

    @Test
    void shouldFailFastComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class366().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class366().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class366().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWithNullArgument() {
        assertTrue(new Class366().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class366().capacity());
    }

    @Test
    void shouldNotThrowOnRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class366().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class366().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class366().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class366().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnRepeatedCall() {
        assertTrue(new Class366().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class366().capacity());
    }

    @Test
    void shouldHandleRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class366().ratio(1.0, 2.0), 1e-9);
    }

}
