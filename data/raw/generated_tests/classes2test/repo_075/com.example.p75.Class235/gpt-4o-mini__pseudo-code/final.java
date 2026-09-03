package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        new Class235().compute(3);
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class235().normalize("  x "));
        assertEquals(7, new Class235().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class235().merge(2, 5));
        assertTrue(new Class235().isValid("abc"));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class235().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        assertEquals(16, new Class235().capacity());
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class235().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

}
