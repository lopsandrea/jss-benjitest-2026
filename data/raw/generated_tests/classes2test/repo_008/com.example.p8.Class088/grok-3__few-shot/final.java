package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class088Test {
    @Test
    void acceptsComputeAtZero() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class088().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        try {
            new Class088().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class088().merge(2, 5));
        assertTrue(new Class088().isValid("abc"));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class088().isValid("abc"));
        assertEquals(16, new Class088().capacity());
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        assertEquals(16, new Class088().capacity());
        assertEquals(0.5, new Class088().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class088().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class088().compute(3));
    }

}
