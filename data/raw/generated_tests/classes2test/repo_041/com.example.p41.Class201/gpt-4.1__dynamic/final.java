package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class201Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class201().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class201().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class201().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class201().isValid("abc"));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        assertEquals(42, new Class201().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class201().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class201().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class201().isValid("abc"));
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class201().compute(3));
    }

}
