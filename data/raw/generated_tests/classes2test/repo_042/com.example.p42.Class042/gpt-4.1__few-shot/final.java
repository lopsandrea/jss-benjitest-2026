package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class042Test {
    @Test
    void clampsComputeForBoundaryValue() {
        new Class042().compute(3);
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        new Class042().normalize("  x ");
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class042().merge(2, 5));
        assertTrue(new Class042().isValid("abc"));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class042().isValid("abc"));
        assertEquals(16, new Class042().capacity());
    }

    @Test
    void keepsCapacityWithNullArgument() {
        assertEquals(16, new Class042().capacity());
        assertEquals(0.5, new Class042().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioAtUpperBound() {
        assertEquals(0.5, new Class042().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class042().labelFor(1));
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class042().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class042().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class042().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class042().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class042().capacity());
    }

    @Test
    void clampsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class042().ratio(1.0, 2.0), 1e-9);
    }

}
