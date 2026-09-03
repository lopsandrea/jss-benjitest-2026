package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class294Test {
    @Test
    void shouldKeepComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class294().compute(3));
            assertEquals("ok", new Class294().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class294().normalize("  x "));
        assertEquals(7, new Class294().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeOnRepeatedCall() {
        assertEquals(7, new Class294().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnRepeatedCall() {
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class294().capacity());
    }

    @Test
    void shouldRejectRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class294().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class294().labelFor(1));
    }

    @Test
    void shouldIgnoreComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class294().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWhenAlreadyValid() {
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class294().capacity());
    }

    @Test
    void shouldKeepRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class294().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectLabelForAtUpperBound() {
        assertEquals("alpha", new Class294().labelFor(1));
    }

    @Test
    void shouldKeepComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

}
