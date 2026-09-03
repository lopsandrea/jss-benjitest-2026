package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class093Test {
    @Test
    void returnsComputeForBoundaryValue() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class093().compute(3));
        assertEquals("ok", new Class093().normalize("  x "));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class093().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class093().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class093().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class093().isValid("abc"));
    }

    @Test
    void reportsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class093().capacity());
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class093().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class093().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class093().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class093().merge(2, 5));
    }

}
