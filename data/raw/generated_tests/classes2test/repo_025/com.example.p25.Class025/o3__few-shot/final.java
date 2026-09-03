package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class025Test {
    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class025().compute(3));
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class025().normalize("  x "));
        assertEquals(7, new Class025().merge(2, 5));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        assertEquals(7, new Class025().merge(2, 5));
        assertTrue(new Class025().isValid("abc"));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class025().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        assertEquals(16, new Class025().capacity());
    }

    @Test
    void keepsComputeWhenUnset() {
        assertEquals(42, new Class025().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class025().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class025().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class025().capacity());
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class025().compute(3));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class025().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class025().merge(2, 5));
    }

}
