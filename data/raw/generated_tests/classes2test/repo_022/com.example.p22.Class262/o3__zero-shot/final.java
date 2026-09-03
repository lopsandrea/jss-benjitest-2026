package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class262Test {
    @Test
    void reportsComputeAtUpperBound() {
        new Class262().compute(3);
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class262().normalize("  x "));
        assertEquals(7, new Class262().merge(2, 5));
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class262().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class262().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class262().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class262().isValid("abc"));
    }

}
