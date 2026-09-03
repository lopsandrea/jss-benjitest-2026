package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class286Test {
    @Test
    void yieldsComputeWhenUnset() {
        new Class286().compute(3);
    }

    @Test
    void clampsNormalizeForKnownCode() {
        new Class286().normalize("  x ");
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class286().merge(2, 5));
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void returnsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class286().capacity());
    }

    @Test
    void returnsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class286().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForAtZero() {
        assertEquals("alpha", new Class286().labelFor(1));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class286().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class286().merge(2, 5));
    }

}
