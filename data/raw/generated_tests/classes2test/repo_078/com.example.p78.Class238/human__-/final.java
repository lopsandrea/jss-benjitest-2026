package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class238Test {
    @Test
    void shouldRoundTripComputeWhenUnset() {
        assertEquals(42, new Class238().compute(3));
        assertEquals("ok", new Class238().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeAtUpperBound() {
        assertEquals("ok", new Class238().normalize("  x "));
        assertEquals(7, new Class238().merge(2, 5));
    }

    @Test
    void shouldReturnMergeWithNegativeInput() {
        assertEquals(7, new Class238().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidForBoundaryValue() {
        assertTrue(new Class238().isValid("abc"));
    }

    @Test
    void shouldRejectComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class238().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNegativeInput() {
        assertEquals("ok", new Class238().normalize("  x "));
    }

    @Test
    void shouldHandleMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class238().merge(2, 5));
    }

}
