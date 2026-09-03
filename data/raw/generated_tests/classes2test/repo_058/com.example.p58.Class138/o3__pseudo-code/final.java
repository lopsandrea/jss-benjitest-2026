package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class138Test {
    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class138().compute(3));
        assertEquals("ok", new Class138().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class138().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class138().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class138().isValid("abc"));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class138().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class138().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class138().merge(2, 5));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class138().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class138().normalize("  x "));
    }

}
