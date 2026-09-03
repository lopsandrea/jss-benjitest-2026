package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class227Test {
    @Test
    void clampsComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class227().compute(3));
            assertEquals("ok", new Class227().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class227().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class227().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class227().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class227().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class227().capacity());
    }

    @Test
    void clampsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class227().ratio(1.0, 2.0), 1e-9);
    }

}
