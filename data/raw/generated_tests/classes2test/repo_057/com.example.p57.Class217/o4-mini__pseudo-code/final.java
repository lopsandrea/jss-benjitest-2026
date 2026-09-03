package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class217Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        new Class217().compute(3);
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        new Class217().normalize("  x ");
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class217().merge(2, 5));
        assertTrue(new Class217().isValid("abc"));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class217().isValid("abc"));
        assertEquals(16, new Class217().capacity());
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class217().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class217().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class217().merge(2, 5));
    }

}
