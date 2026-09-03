package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class095Test {
    @Test
    void shouldKeepComputeOnEmptyString() {
        assertEquals(42, new Class095().compute(3));
        assertEquals("ok", new Class095().normalize("  x "));
    }

    @Test
    void shouldKeepNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class095().normalize("  x "));
        assertEquals(7, new Class095().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeOnTrimmedInput() {
        assertEquals(7, new Class095().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnMixedCase() {
        assertTrue(new Class095().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class095().capacity());
    }

    @Test
    void shouldReturnRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class095().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class095().compute(3));
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class095().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class095().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnMixedCase() {
        assertTrue(new Class095().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class095().capacity());
    }

    @Test
    void shouldIgnoreRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class095().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class095().labelFor(1));
    }

    @Test
    void shouldRejectResetOnEmptyString() {
        new Class095().reset();
        assertNotNull(new Class095());
    }

}
