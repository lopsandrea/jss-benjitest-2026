package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class238Test {
    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class238().compute(3));
        assertEquals("ok", new Class238().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class238().normalize("  x "));
        assertEquals(7, new Class238().merge(2, 5));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class238().merge(2, 5));
        assertTrue(new Class238().isValid("abc"));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class238().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class238().capacity());
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class238().capacity());
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class238().compute(3));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class238().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class238().normalize("  x "));
    }

}
