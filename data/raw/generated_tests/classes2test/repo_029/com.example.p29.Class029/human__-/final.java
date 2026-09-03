package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class029Test {
    @Test
    void shouldRoundTripComputeAtUpperBound() {
        try {
            new Class029().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class029().normalize("  x "));
        assertEquals(7, new Class029().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeAtZero() {
        assertEquals(7, new Class029().merge(2, 5));
        assertTrue(new Class029().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidAtZero() {
        assertTrue(new Class029().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class029().capacity());
    }

    @Test
    void shouldHandleCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class029().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class029().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class029().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class029().labelFor(1));
    }

    @Test
    void shouldKeepComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class029().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class029().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class029().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnMixedCase() {
        assertTrue(new Class029().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class029().capacity());
    }

}
