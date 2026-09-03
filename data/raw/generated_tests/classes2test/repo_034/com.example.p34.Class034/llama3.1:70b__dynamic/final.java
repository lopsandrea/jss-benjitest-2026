package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class034Test {
    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class034().compute(3));
        assertEquals("ok", new Class034().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class034().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class034().merge(2, 5));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class034().merge(2, 5));
        assertTrue(new Class034().isValid("abc"));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class034().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class034().capacity());
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class034().capacity());
    }

    @Test
    void clampsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class034().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnMixedCase() {
        assertEquals("alpha", new Class034().labelFor(1));
    }

    @Test
    void yieldsResetAtZero() {
        new Class034().reset();
        assertNotNull(new Class034());
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class034().compute(3));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class034().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class034().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class034().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class034().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class034().capacity());
    }

}
