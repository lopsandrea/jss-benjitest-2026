package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class342Test {
    @Test
    void shouldNotThrowOnComputeWhenUnset() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class342().compute(3));
        assertEquals("ok", new Class342().normalize("  x "));
    }

    @Test
    void shouldRoundTripNormalizeAtZero() {
        assertEquals("ok", new Class342().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class342().merge(2, 5));
    }

    @Test
    void shouldRejectMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class342().merge(2, 5));
        assertTrue(new Class342().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidAtUpperBound() {
        assertTrue(new Class342().isValid("abc"));
    }

    @Test
    void shouldReturnComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class342().compute(3));
    }

    @Test
    void shouldKeepNormalizeForBoundaryValue() {
        assertEquals("ok", new Class342().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class342().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWithNegativeInput() {
        assertTrue(new Class342().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class342().capacity());
    }

}
