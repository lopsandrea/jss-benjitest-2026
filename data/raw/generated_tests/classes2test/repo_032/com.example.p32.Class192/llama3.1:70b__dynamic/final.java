package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class192Test {
    @Test
    void returnsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class192().compute(3));
            assertEquals("ok", new Class192().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class192().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class192().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class192().isValid("abc"));
    }

    @Test
    void reportsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class192().capacity());
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class192().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class192().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class192().merge(2, 5));
    }

}
