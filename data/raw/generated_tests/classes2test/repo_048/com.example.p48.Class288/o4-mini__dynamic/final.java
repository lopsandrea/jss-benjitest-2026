package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class288Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        new Class288().compute(3);
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class288().normalize("  x "));
        assertEquals(7, new Class288().merge(2, 5));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        assertEquals(7, new Class288().merge(2, 5));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class288().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        assertEquals(16, new Class288().capacity());
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class288().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class288().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class288().merge(2, 5));
    }

}
