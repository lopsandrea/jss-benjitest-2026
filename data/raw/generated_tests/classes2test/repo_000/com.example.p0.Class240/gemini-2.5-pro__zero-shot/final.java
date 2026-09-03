package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class240Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class240().compute(3));
        assertEquals("ok", new Class240().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class240().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class240().merge(2, 5));
    }

    @Test
    void keepsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class240().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class240().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class240().capacity());
    }

    @Test
    void acceptsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class240().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWhenUnset() {
        assertEquals("alpha", new Class240().labelFor(1));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class240().compute(3));
    }

}
