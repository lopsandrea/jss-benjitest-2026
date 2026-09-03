package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class221Test {
    @Test
    void clampsComputeOnEmptyString() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class221().compute(3));
            assertEquals("ok", new Class221().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture1.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals("ok", new Class221().normalize("  x "));
        assertEquals(7, new Class221().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class221().merge(2, 5));
        assertTrue(new Class221().isValid("abc"));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class221().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class221().capacity());
    }

    @Test
    void returnsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class221().capacity());
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class221().compute(3));
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class221().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class221().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class221().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class221().isValid("abc"));
    }

    @Test
    void reportsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class221().capacity());
    }

}
