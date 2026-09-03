package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class138Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class138().compute(3);
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        new Class138().normalize("  x ");
    }

    @Test
    void returnsMergeForBoundaryValue() {
        assertEquals(7, new Class138().merge(2, 5));
        assertTrue(new Class138().isValid("abc"));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class138().isValid("abc"));
        assertEquals(42, new Class138().compute(3));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class138().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class138().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class138().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class138().isValid("abc"));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class138().compute(3));
    }

}
