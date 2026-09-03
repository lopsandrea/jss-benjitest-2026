package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class245Test {
    @Test
    void shouldKeepComputeForBoundaryValue() {
        assertEquals(42, new Class245().compute(3));
        assertEquals("ok", new Class245().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeAtUpperBound() {
        assertEquals("ok", new Class245().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class245().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class245().merge(2, 5));
        assertTrue(new Class245().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidAtUpperBound() {
        assertTrue(new Class245().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class245().capacity());
    }

    @Test
    void shouldRoundTripRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class245().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class245().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class245().normalize("  x "));
    }

}
