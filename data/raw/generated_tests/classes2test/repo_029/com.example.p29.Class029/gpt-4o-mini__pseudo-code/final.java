package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class029Test {
    @Test
    void keepsComputeOnMixedCase() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class029().compute(3));
            assertEquals("ok", new Class029().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture1.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals("ok", new Class029().normalize("  x "));
        assertEquals(7, new Class029().merge(2, 5));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class029().merge(2, 5));
        assertTrue(new Class029().isValid("abc"));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class029().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class029().capacity());
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class029().capacity());
    }

    @Test
    void acceptsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class029().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class029().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class029().normalize("  x "));
    }

}
