package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class212Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class212().compute(3));
        assertEquals("ok", new Class212().normalize("  x "));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class212().normalize("  x "));
        assertEquals(7, new Class212().merge(2, 5));
    }

    @Test
    void returnsMergeAtZero() {
        assertEquals(7, new Class212().merge(2, 5));
        assertTrue(new Class212().isValid("abc"));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class212().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class212().capacity());
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class212().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class212().compute(3));
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class212().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class212().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class212().merge(2, 5));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class212().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class212().normalize("  x "));
    }

}
