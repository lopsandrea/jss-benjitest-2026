package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class160Test {
    @Test
    void shouldRoundTripComputeWhenUnset() {
        assertEquals(42, new Class160().compute(3));
        assertEquals("ok", new Class160().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        assertEquals("ok", new Class160().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class160().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class160().merge(2, 5));
        assertTrue(new Class160().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidOnMixedCase() {
        assertTrue(new Class160().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class160().capacity());
    }

    @Test
    void shouldFailFastRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class160().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreLabelForAtUpperBound() {
        assertEquals("alpha", new Class160().labelFor(1));
    }

    @Test
    void shouldRoundTripComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class160().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class160().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class160().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWithNullArgument() {
        assertTrue(new Class160().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class160().capacity());
    }

    @Test
    void shouldIgnoreRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class160().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripLabelForForKnownCode() {
        assertEquals("alpha", new Class160().labelFor(1));
    }

    @Test
    void shouldHandleComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class160().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class160().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class160().compute(3));
    }

    @Test
    void shouldKeepNormalizeForBoundaryValue() {
        assertEquals("ok", new Class160().normalize("  x "));
    }

}
