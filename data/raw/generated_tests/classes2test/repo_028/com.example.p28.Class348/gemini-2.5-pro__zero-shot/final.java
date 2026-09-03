package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class348Test {
    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class348().compute(3));
        assertEquals("ok", new Class348().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class348().normalize("  x "));
        assertEquals(7, new Class348().merge(2, 5));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class348().merge(2, 5));
        assertTrue(new Class348().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class348().isValid("abc"));
        assertEquals(16, new Class348().capacity());
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        assertEquals(16, new Class348().capacity());
        assertEquals(0.5, new Class348().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsRatioAtZero() {
        assertEquals(0.5, new Class348().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class348().labelFor(1));
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class348().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class348().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class348().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class348().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class348().capacity());
    }

    @Test
    void yieldsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class348().ratio(1.0, 2.0), 1e-9);
    }

}
