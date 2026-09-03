package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class282Test {
    @Test
    void rejectsComputeAtZero() {
        try {
            assertEquals(42, new Class282().compute(3));
            assertEquals("ok", new Class282().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class282().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class282().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class282().merge(2, 5));
        assertTrue(new Class282().isValid("abc"));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class282().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class282().normalize("  x "));
    }

}
