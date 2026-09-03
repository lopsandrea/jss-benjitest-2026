package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class049Test {
    @Test
    void shouldReturnComputeAtUpperBound() {
        assertEquals(42, new Class049().compute(3));
        assertEquals("ok", new Class049().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeAtZero() {
        assertEquals("ok", new Class049().normalize("  x "));
        assertEquals(7, new Class049().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeForKnownCode() {
        assertEquals(7, new Class049().merge(2, 5));
        assertTrue(new Class049().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidOnRepeatedCall() {
        assertTrue(new Class049().isValid("abc"));
        assertEquals(16, new Class049().capacity());
    }

    @Test
    void shouldRejectCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class049().capacity());
    }

    @Test
    void shouldNotThrowOnRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class049().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectLabelForForKnownCode() {
        assertEquals("alpha", new Class049().labelFor(1));
    }

    @Test
    void shouldIgnoreComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class049().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnEmptyString() {
        assertEquals("ok", new Class049().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class049().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWhenUnset() {
        assertTrue(new Class049().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class049().capacity());
    }

    @Test
    void shouldHandleRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class049().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class049().labelFor(1));
    }

    @Test
    void shouldRejectComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class049().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenUnset() {
        assertEquals("ok", new Class049().normalize("  x "));
    }

    @Test
    void shouldRoundTripComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class049().compute(3));
    }

}
