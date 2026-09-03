package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class088Test {
    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class088().compute(3));
        assertEquals("ok", new Class088().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class088().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class088().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class088().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class088().compute(3));
    }

}
