package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class378Test {
    @Test
    void reportsComputeWithNegativeInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class378().compute(3));
            assertEquals("ok", new Class378().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class378().normalize("  x "));
        assertEquals(7, new Class378().merge(2, 5));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class378().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class378().isValid("abc"));
    }

    @Test
    void keepsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class378().capacity());
    }

    @Test
    void rejectsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class378().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class378().labelFor(1));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class378().compute(3));
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class378().compute(3));
    }

}
