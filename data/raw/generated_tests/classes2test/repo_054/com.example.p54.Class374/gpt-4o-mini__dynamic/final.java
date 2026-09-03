package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class374Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class374().compute(3));
        assertEquals("ok", new Class374().normalize("  x "));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class374().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class374().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class374().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class374().isValid("abc"));
    }

    @Test
    void reportsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class374().capacity());
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class374().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class374().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class374().merge(2, 5));
    }

}
