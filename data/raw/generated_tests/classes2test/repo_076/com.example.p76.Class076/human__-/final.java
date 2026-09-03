package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class076Test {
    @Test
    void shouldKeepComputeForKnownCode() {
        assertEquals(42, new Class076().compute(3));
        assertEquals("ok", new Class076().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        assertEquals("ok", new Class076().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class076().merge(2, 5));
    }

    @Test
    void shouldRejectMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class076().merge(2, 5));
        assertTrue(new Class076().isValid("abc"));
    }

    @Test
    void shouldHandleIsValidOnRepeatedCall() {
        assertTrue(new Class076().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class076().capacity());
    }

    @Test
    void shouldFailFastRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class076().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForForBoundaryValue() {
        assertEquals("alpha", new Class076().labelFor(1));
    }

    @Test
    void shouldRoundTripComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class076().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class076().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class076().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnEmptyString() {
        assertTrue(new Class076().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class076().capacity());
    }

    @Test
    void shouldFailFastRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class076().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class076().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnEmptyString() {
        assertEquals("ok", new Class076().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class076().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWhenAlreadyValid() {
        assertTrue(new Class076().isValid("abc"));
    }

}
