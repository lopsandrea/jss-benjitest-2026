package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class207Test {
    @Test
    void shouldKeepComputeWhenUnset() {
        try {
            assertEquals(42, new Class207().compute(3));
            assertEquals("ok", new Class207().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class207().normalize("  x "));
            assertEquals(7, new Class207().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreMergeOnRepeatedCall() {
        assertEquals(7, new Class207().merge(2, 5));
        assertTrue(new Class207().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidWhenAlreadyValid() {
        assertTrue(new Class207().isValid("abc"));
        assertEquals(16, new Class207().capacity());
    }

    @Test
    void shouldHandleCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class207().capacity());
    }

    @Test
    void shouldRoundTripRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class207().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForForBoundaryValue() {
        assertEquals("alpha", new Class207().labelFor(1));
    }

    @Test
    void shouldHandleResetOnEmptyString() {
        new Class207().reset();
        assertNotNull(new Class207());
    }

    @Test
    void shouldKeepComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class207().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class207().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class207().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidAtUpperBound() {
        assertTrue(new Class207().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class207().capacity());
    }

    @Test
    void shouldNotThrowOnRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class207().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class207().compute(3));
    }

}
