package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class205Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        try {
            new Class205().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeAtZero() {
        new Class205().normalize("  x ");
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class205().merge(2, 5));
        assertTrue(new Class205().isValid("abc"));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class205().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class205().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class205().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class205().isValid("abc"));
    }

    @Test
    void reportsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class205().capacity());
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class205().compute(3));
    }

}
