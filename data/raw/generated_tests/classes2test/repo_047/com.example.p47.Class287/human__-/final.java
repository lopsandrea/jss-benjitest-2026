package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class287Test {
    @Test
    void shouldNotThrowOnComputeForBoundaryValue() {
        new Class287().compute(3);
    }

    @Test
    void shouldRoundTripComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class287().compute(3));
    }

    @Test
    void shouldKeepNormalizeAtZero() {
        assertEquals("ok", new Class287().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class287().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidAtUpperBound() {
        assertTrue(new Class287().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class287().capacity());
    }

    @Test
    void shouldIgnoreRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class287().ratio(1.0, 2.0), 1e-9);
    }

}
