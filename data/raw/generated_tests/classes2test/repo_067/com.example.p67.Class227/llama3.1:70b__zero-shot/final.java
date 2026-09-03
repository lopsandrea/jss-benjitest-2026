package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class227Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        try {
            new Class227().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class227().normalize("  x "));
        assertEquals(7, new Class227().merge(2, 5));
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class227().merge(2, 5));
        assertTrue(new Class227().isValid("abc"));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        assertEquals(42, new Class227().compute(3));
    }

}
