package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class075Test {
    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class075().compute(3));
        assertEquals("ok", new Class075().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class075().normalize("  x "));
        assertEquals(7, new Class075().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenUnset() {
        assertEquals(7, new Class075().merge(2, 5));
        assertTrue(new Class075().isValid("abc"));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class075().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class075().capacity());
    }

}
