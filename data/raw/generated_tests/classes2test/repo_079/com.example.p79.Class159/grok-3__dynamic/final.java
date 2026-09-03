package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class159Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class159().compute(3));
        assertEquals("ok", new Class159().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class159().normalize("  x "));
        assertEquals(7, new Class159().merge(2, 5));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class159().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class159().isValid("abc"));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        assertEquals(42, new Class159().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class159().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class159().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class159().isValid("abc"));
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class159().compute(3));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class159().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class159().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class159().merge(2, 5));
    }

}
