package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class234Test {
    @Test
    void shouldKeepComputeForBoundaryValue() {
        assertEquals(42, new Class234().compute(3));
        assertEquals("ok", new Class234().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeWhenUnset() {
        assertEquals("ok", new Class234().normalize("  x "));
        assertEquals(7, new Class234().merge(2, 5));
    }

    @Test
    void shouldKeepMergeAtZero() {
        assertEquals(7, new Class234().merge(2, 5));
        assertTrue(new Class234().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidAtZero() {
        assertTrue(new Class234().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class234().capacity());
    }

    @Test
    void shouldRoundTripComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class234().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWhenUnset() {
        assertEquals("ok", new Class234().normalize("  x "));
    }

}
