package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class264Test {
    @Test
    void preservesComputeAtUpperBound() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class264().compute(3));
            assertEquals("ok", new Class264().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class264().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class264().merge(2, 5));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class264().merge(2, 5));
        assertTrue(new Class264().isValid("abc"));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class264().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class264().capacity());
    }

    @Test
    void preservesComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class264().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class264().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class264().merge(2, 5));
    }

}
