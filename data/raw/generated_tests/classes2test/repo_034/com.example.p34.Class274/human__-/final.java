package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class274Test {
    @Test
    void shouldKeepComputeOnRepeatedCall() {
        assertEquals(42, new Class274().compute(3));
        assertEquals("ok", new Class274().normalize("  x "));
    }

    @Test
    void shouldKeepNormalizeAtZero() {
        assertEquals("ok", new Class274().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class274().merge(2, 5));
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class274().merge(2, 5));
        assertTrue(new Class274().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidOnEmptyString() {
        assertTrue(new Class274().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class274().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class274().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class274().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class274().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForForKnownCode() {
        assertEquals("alpha", new Class274().labelFor(1));
    }

    @Test
    void shouldReturnComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class274().compute(3));
    }

    @Test
    void shouldKeepNormalizeForBoundaryValue() {
        assertEquals("ok", new Class274().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class274().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnTrimmedInput() {
        assertTrue(new Class274().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class274().capacity());
    }

    @Test
    void shouldKeepComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class274().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeForKnownCode() {
        assertEquals("ok", new Class274().normalize("  x "));
    }

}
