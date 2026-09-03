package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class058Test {
    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class058().compute(3));
        assertEquals("ok", new Class058().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class058().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        assertEquals(7, new Class058().merge(2, 5));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class058().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class058().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class058().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class058().isValid("abc"));
    }

}
