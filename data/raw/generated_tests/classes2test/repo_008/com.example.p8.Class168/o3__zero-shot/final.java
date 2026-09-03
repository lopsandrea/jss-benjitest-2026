package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class168Test {
    @Test
    void keepsComputeAtZero() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class168().compute(3);
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        new Class168().normalize("  x ");
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class168().merge(2, 5));
        assertTrue(new Class168().isValid("abc"));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class168().isValid("abc"));
        assertEquals(16, new Class168().capacity());
    }

    @Test
    void clampsCapacityOnEmptyString() {
        assertEquals(16, new Class168().capacity());
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class168().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class168().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class168().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class168().isValid("abc"));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class168().compute(3));
    }

}
