package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class340Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class340().compute(3));
        assertEquals("ok", new Class340().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class340().normalize("  x "));
        assertEquals(7, new Class340().merge(2, 5));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class340().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class340().isValid("abc"));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class340().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class340().normalize("  x "));
    }

}
