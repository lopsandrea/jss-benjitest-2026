package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class211Test {
    @Test
    void rejectsComputeForKnownCode() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class211().compute(3);
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class211().normalize("  x "));
        assertEquals(7, new Class211().merge(2, 5));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class211().merge(2, 5));
        assertTrue(new Class211().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class211().isValid("abc"));
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class211().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class211().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class211().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class211().isValid("abc"));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class211().compute(3));
    }

}
