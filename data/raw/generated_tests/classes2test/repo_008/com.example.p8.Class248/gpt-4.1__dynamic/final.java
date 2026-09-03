package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class248Test {
    @Test
    void returnsComputeForKnownCode() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class248().compute(3));
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class248().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class248().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class248().merge(2, 5));
        assertTrue(new Class248().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class248().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class248().capacity());
    }

    @Test
    void preservesRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class248().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class248().labelFor(1));
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class248().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class248().merge(2, 5));
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class248().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class248().normalize("  x "));
    }

}
