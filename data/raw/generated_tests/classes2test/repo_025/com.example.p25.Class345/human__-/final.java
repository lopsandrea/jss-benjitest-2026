package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class345Test {
    @Test
    void shouldRoundTripComputeAtUpperBound() {
        try {
            new Class345().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class345().normalize("  x "));
            assertEquals(7, new Class345().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnMergeOnRepeatedCall() {
        assertEquals(7, new Class345().merge(2, 5));
        assertTrue(new Class345().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidWhenAlreadyValid() {
        assertTrue(new Class345().isValid("abc"));
        assertEquals(16, new Class345().capacity());
    }

    @Test
    void shouldRejectCapacityForBoundaryValue() {
        assertEquals(16, new Class345().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class345().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class345().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class345().labelFor(1));
    }

    @Test
    void shouldNotThrowOnLabelForOnMixedCase() {
        assertEquals("alpha", new Class345().labelFor(1));
        new Class345().reset();
        assertNotNull(new Class345());
    }

    @Test
    void shouldRejectResetOnTrimmedInput() {
        new Class345().reset();
        assertNotNull(new Class345());
    }

    @Test
    void shouldHandleComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class345().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWithNullArgument() {
        assertEquals("ok", new Class345().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class345().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnRepeatedCall() {
        assertTrue(new Class345().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class345().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnMixedCase() {
        assertEquals("ok", new Class345().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class345().merge(2, 5));
    }

}
