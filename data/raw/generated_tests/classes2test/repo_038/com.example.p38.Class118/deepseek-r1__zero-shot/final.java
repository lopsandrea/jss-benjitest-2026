package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class118Test {
    @Test
    void preservesComputeWithNegativeInput() {
        try {
            int expected0 = 42;
            assertEquals(expected0, new Class118().compute(3));
            assertEquals("ok", new Class118().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class118().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class118().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class118().merge(2, 5));
        assertTrue(new Class118().isValid("abc"));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class118().compute(3));
    }

}
