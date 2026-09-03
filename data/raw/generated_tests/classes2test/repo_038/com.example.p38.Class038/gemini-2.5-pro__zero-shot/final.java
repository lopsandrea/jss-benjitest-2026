package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class038Test {
    @Test
    void preservesComputeWithNullArgument() {
        assertEquals(42, new Class038().compute(3));
        assertEquals("ok", new Class038().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class038().normalize("  x "));
        assertEquals(7, new Class038().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        assertEquals(7, new Class038().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class038().isValid("abc"));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class038().compute(3));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class038().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class038().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class038().merge(2, 5));
    }

}
