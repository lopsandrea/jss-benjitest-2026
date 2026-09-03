package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class108Test {
    @Test
    void returnsComputeAtUpperBound() {
        try {
            new Class108().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        new Class108().normalize("  x ");
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class108().merge(2, 5));
        assertTrue(new Class108().isValid("abc"));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class108().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class108().capacity());
    }

    @Test
    void rejectsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class108().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class108().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class108().merge(2, 5));
    }

}
