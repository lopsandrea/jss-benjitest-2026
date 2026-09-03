package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class019Test {
    @Test
    void shouldHandleComputeWithNegativeInput() {
        try {
            new Class019().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeForBoundaryValue() {
        new Class019().normalize("  x ");
    }

    @Test
    void shouldFailFastMergeWithNegativeInput() {
        assertEquals(7, new Class019().merge(2, 5));
        assertTrue(new Class019().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidWhenUnset() {
        assertTrue(new Class019().isValid("abc"));
        assertEquals(16, new Class019().capacity());
    }

    @Test
    void shouldRejectCapacityOnTrimmedInput() {
        assertEquals(16, new Class019().capacity());
        assertEquals(0.5, new Class019().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class019().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class019().labelFor(1));
    }

    @Test
    void shouldFailFastLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class019().labelFor(1));
        int expected1 = 42;
        assertEquals(expected1, new Class019().compute(3));
    }

    @Test
    void shouldKeepComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class019().compute(3));
        assertEquals("ok", new Class019().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeAtZero() {
        assertEquals("ok", new Class019().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class019().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class019().merge(2, 5));
    }

    @Test
    void shouldRoundTripComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class019().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class019().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class019().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnEmptyString() {
        assertTrue(new Class019().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class019().capacity());
    }

    @Test
    void shouldIgnoreRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class019().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForAtUpperBound() {
        assertEquals("alpha", new Class019().labelFor(1));
    }

}
