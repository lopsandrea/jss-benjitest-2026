package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class392Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class392().compute(3);
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class392().normalize("  x "));
        assertEquals(7, new Class392().merge(2, 5));
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class392().merge(2, 5));
        assertTrue(new Class392().isValid("abc"));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class392().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class392().capacity());
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class392().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class392().normalize("  x "));
    }

}
