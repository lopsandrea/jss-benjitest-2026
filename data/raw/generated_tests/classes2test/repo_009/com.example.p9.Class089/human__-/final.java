package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class089Test {
    @Test
    void shouldRejectComputeOnRepeatedCall() {
        new Class089().compute(3);
    }

    @Test
    void shouldRejectNormalizeAtUpperBound() {
        assertEquals("ok", new Class089().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class089().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class089().merge(2, 5));
        assertTrue(new Class089().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidOnEmptyString() {
        assertTrue(new Class089().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class089().capacity());
    }

    @Test
    void shouldRoundTripCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class089().capacity());
    }

    @Test
    void shouldReturnRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class089().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreLabelForOnMixedCase() {
        assertEquals("alpha", new Class089().labelFor(1));
    }

    @Test
    void shouldRoundTripResetAtZero() {
        new Class089().reset();
        assertNotNull(new Class089());
    }

    @Test
    void shouldIgnoreComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class089().compute(3));
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class089().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWhenAlreadyValid() {
        assertTrue(new Class089().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class089().capacity());
    }

    @Test
    void shouldRoundTripComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class089().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

}
