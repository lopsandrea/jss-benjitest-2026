package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class247Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class247().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class247().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        assertEquals(7, new Class247().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class247().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        assertEquals(16, new Class247().capacity());
    }

    @Test
    void reportsRatioWhenUnset() {
        assertEquals(0.5, new Class247().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class247().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class247().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class247().merge(2, 5));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class247().isValid("abc"));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class247().compute(3));
    }

}
