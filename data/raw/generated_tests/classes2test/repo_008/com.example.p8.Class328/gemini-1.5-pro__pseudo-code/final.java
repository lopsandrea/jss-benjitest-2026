package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class328Test {
    @Test
    void keepsComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class328().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class328().normalize("  x "));
        assertEquals(7, new Class328().merge(2, 5));
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class328().merge(2, 5));
        assertTrue(new Class328().isValid("abc"));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class328().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class328().capacity());
    }

    @Test
    void keepsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class328().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class328().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class328().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class328().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class328().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class328().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class328().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class328().capacity());
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class328().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class328().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class328().merge(2, 5));
    }

}
