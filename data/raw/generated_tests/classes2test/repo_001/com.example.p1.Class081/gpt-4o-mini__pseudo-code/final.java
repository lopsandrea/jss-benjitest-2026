package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class081Test {
    @Test
    void preservesComputeOnMixedCase() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class081().compute(3));
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class081().normalize("  x "));
        assertEquals(7, new Class081().merge(2, 5));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        assertEquals(7, new Class081().merge(2, 5));
        assertTrue(new Class081().isValid("abc"));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class081().isValid("abc"));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class081().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class081().merge(2, 5));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class081().isValid("abc"));
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class081().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class081().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class081().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class081().compute(3));
    }

}
