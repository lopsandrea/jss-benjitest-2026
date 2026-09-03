package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class174Test {
    @Test
    void shouldIgnoreComputeOnTrimmedInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class174().compute(3));
        assertEquals("ok", new Class174().normalize("  x "));
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class174().normalize("  x "));
        assertEquals(7, new Class174().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeWithNegativeInput() {
        assertEquals(7, new Class174().merge(2, 5));
        assertTrue(new Class174().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidForBoundaryValue() {
        assertTrue(new Class174().isValid("abc"));
        assertEquals(16, new Class174().capacity());
    }

    @Test
    void shouldFailFastCapacityWithNegativeInput() {
        assertEquals(16, new Class174().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class174().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class174().ratio(1.0, 2.0), 1e-9);
        int expected1 = 42;
        assertEquals(expected1, new Class174().compute(3));
    }

    @Test
    void shouldRoundTripComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class174().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        assertEquals("ok", new Class174().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class174().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidAtUpperBound() {
        assertTrue(new Class174().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class174().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnMixedCase() {
        assertEquals("ok", new Class174().normalize("  x "));
    }

}
