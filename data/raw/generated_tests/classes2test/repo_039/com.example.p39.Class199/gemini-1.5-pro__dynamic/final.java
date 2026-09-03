package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class199Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class199().compute(3));
        assertEquals("ok", new Class199().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class199().normalize("  x "));
        assertEquals(7, new Class199().merge(2, 5));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class199().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class199().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        assertEquals(16, new Class199().capacity());
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class199().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class199().normalize("  x "));
    }

}
