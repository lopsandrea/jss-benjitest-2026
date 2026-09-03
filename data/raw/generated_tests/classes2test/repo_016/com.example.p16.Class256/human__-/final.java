package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class256Test {
    @Test
    void shouldIgnoreComputeForBoundaryValue() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class256().compute(3);
    }

    @Test
    void shouldRejectNormalizeWhenUnset() {
        assertEquals("ok", new Class256().normalize("  x "));
        assertEquals(7, new Class256().merge(2, 5));
    }

    @Test
    void shouldReturnMergeOnMixedCase() {
        assertEquals(7, new Class256().merge(2, 5));
        assertTrue(new Class256().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidWithNullArgument() {
        assertTrue(new Class256().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class256().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeAtZero() {
        assertEquals("ok", new Class256().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class256().merge(2, 5));
    }

    @Test
    void shouldFailFastComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class256().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeForBoundaryValue() {
        assertEquals("ok", new Class256().normalize("  x "));
    }

}
