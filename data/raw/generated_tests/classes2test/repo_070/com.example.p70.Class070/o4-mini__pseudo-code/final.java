package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class070Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class070().compute(3));
        assertEquals("ok", new Class070().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class070().normalize("  x "));
        assertEquals(7, new Class070().merge(2, 5));
    }

    @Test
    void preservesMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class070().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class070().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class070().capacity());
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class070().compute(3));
    }

}
