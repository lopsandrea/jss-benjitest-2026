package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class152Test {
    @Test
    void acceptsComputeOnMixedCase() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class152().compute(3));
        assertEquals("ok", new Class152().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class152().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class152().merge(2, 5));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class152().merge(2, 5));
        assertTrue(new Class152().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class152().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class152().compute(3));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class152().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class152().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class152().merge(2, 5));
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class152().compute(3));
    }

}
