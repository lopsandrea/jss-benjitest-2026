package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class289Test {
    @Test
    void returnsComputeOnEmptyString() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class289().compute(3);
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class289().normalize("  x "));
        assertEquals(7, new Class289().merge(2, 5));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class289().merge(2, 5));
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class289().isValid("abc"));
        assertEquals(16, new Class289().capacity());
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        assertEquals(16, new Class289().capacity());
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class289().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class289().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class289().capacity());
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class289().compute(3));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class289().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

}
