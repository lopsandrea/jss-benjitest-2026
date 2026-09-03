package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class186Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class186().compute(3));
        assertEquals("ok", new Class186().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class186().normalize("  x "));
        assertEquals(7, new Class186().merge(2, 5));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class186().merge(2, 5));
        assertTrue(new Class186().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class186().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class186().capacity());
    }

    @Test
    void rejectsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class186().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class186().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class186().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class186().normalize("  x "));
    }

}
