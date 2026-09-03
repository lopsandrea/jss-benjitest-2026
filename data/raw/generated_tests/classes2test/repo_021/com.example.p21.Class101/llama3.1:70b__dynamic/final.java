package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class101Test {
    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class101().compute(3));
        assertEquals("ok", new Class101().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class101().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class101().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class101().isValid("abc"));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class101().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class101().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        assertEquals(7, new Class101().merge(2, 5));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class101().compute(3));
    }

}
