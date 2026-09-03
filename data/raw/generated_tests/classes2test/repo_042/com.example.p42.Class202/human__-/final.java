package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class202Test {
    @Test
    void shouldRejectComputeAtUpperBound() {
        assertEquals(42, new Class202().compute(3));
        assertEquals("ok", new Class202().normalize("  x "));
    }

    @Test
    void shouldHandleNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class202().normalize("  x "));
    }

    @Test
    void shouldKeepComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class202().compute(3));
    }

    @Test
    void shouldRejectNormalizeAtUpperBound() {
        assertEquals("ok", new Class202().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class202().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidWithNullArgument() {
        assertTrue(new Class202().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class202().capacity());
    }

}
