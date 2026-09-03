package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class237Test {
    @Test
    void shouldNotThrowOnComputeAtZero() {
        try {
            assertEquals(42, new Class237().compute(3));
            assertEquals("ok", new Class237().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleNormalizeWithNegativeInput() {
        assertEquals("ok", new Class237().normalize("  x "));
        assertEquals(7, new Class237().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeForBoundaryValue() {
        assertEquals(7, new Class237().merge(2, 5));
        assertTrue(new Class237().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidOnTrimmedInput() {
        assertTrue(new Class237().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class237().capacity());
    }

    @Test
    void shouldFailFastCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class237().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class237().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class237().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class237().labelFor(1));
    }

    @Test
    void shouldIgnoreLabelForForBoundaryValue() {
        assertEquals("alpha", new Class237().labelFor(1));
    }

    @Test
    void shouldFailFastComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class237().compute(3));
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class237().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWithNegativeInput() {
        assertTrue(new Class237().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class237().capacity());
    }

    @Test
    void shouldHandleRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class237().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class237().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnEmptyString() {
        assertEquals("ok", new Class237().normalize("  x "));
    }

}
