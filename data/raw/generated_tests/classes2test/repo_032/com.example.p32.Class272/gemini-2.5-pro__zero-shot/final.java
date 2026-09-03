package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class272Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class272().compute(3));
            assertEquals("ok", new Class272().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class272().normalize("  x "));
        assertEquals(7, new Class272().merge(2, 5));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class272().merge(2, 5));
        assertTrue(new Class272().isValid("abc"));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class272().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class272().capacity());
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class272().capacity());
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class272().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class272().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class272().isValid("abc"));
    }

}
