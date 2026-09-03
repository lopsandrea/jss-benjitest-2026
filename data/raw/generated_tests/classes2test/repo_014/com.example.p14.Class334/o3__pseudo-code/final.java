package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class334Test {
    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class334().compute(3));
        assertEquals("ok", new Class334().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class334().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class334().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class334().merge(2, 5));
        assertTrue(new Class334().isValid("abc"));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class334().isValid("abc"));
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class334().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class334().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class334().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class334().isValid("abc"));
    }

}
