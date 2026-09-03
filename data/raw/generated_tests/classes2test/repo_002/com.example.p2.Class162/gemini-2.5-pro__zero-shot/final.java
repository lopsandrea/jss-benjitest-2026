package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class162Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class162().compute(3));
        assertEquals("ok", new Class162().normalize("  x "));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class162().normalize("  x "));
        assertEquals(7, new Class162().merge(2, 5));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        assertEquals(7, new Class162().merge(2, 5));
        assertTrue(new Class162().isValid("abc"));
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class162().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class162().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class162().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class162().isValid("abc"));
    }

    @Test
    void reportsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class162().capacity());
    }

}
