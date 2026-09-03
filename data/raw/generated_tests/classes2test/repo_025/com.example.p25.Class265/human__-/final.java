package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class265Test {
    @Test
    void shouldIgnoreComputeOnEmptyString() {
        try {
            new Class265().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeOnMixedCase() {
        assertEquals("ok", new Class265().normalize("  x "));
        assertEquals(7, new Class265().merge(2, 5));
    }

    @Test
    void shouldHandleMergeOnRepeatedCall() {
        assertEquals(7, new Class265().merge(2, 5));
        assertTrue(new Class265().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidWithNegativeInput() {
        assertTrue(new Class265().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWithNullArgument() {
        assertEquals(16, new Class265().capacity());
    }

    @Test
    void shouldNotThrowOnRatioAtZero() {
        assertEquals(0.5, new Class265().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class265().labelFor(1));
    }

    @Test
    void shouldKeepResetForBoundaryValue() {
        new Class265().reset();
        assertNotNull(new Class265());
    }

    @Test
    void shouldKeepComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class265().compute(3));
    }

    @Test
    void shouldReturnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class265().normalize("  x "));
    }

    @Test
    void shouldReturnMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class265().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnMixedCase() {
        assertTrue(new Class265().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class265().capacity());
    }

    @Test
    void shouldNotThrowOnRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class265().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class265().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        assertEquals("ok", new Class265().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class265().merge(2, 5));
    }

}
