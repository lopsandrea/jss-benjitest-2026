package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class271Test {
    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class271().compute(3));
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class271().normalize("  x "));
        assertEquals(7, new Class271().merge(2, 5));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class271().merge(2, 5));
        assertTrue(new Class271().isValid("abc"));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class271().isValid("abc"));
    }

    @Test
    void returnsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class271().capacity());
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class271().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class271().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class271().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class271().capacity());
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class271().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class271().normalize("  x "));
    }

}
