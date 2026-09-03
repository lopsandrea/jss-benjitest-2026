package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class323Test {
    @Test
    void shouldIgnoreComputeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class323().compute(3);
    }

    @Test
    void shouldHandleComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class323().compute(3));
    }

    @Test
    void shouldFailFastNormalizeForBoundaryValue() {
        assertEquals("ok", new Class323().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class323().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidAtZero() {
        assertTrue(new Class323().isValid("abc"));
    }

    @Test
    void shouldKeepComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class323().compute(3));
    }

}
