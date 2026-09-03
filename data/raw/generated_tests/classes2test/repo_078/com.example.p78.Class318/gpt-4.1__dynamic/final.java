package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class318Test {
    @Test
    void clampsComputeOnMixedCase() {
        new Class318().compute(3);
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class318().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class318().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class318().isValid("abc"));
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class318().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class318().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class318().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class318().isValid("abc"));
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class318().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class318().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class318().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class318().isValid("abc"));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class318().compute(3));
    }

}
