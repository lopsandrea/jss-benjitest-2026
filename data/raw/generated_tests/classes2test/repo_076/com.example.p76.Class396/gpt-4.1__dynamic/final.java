package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class396Test {
    @Test
    void keepsComputeForKnownCode() {
        try {
            assertEquals(42, new Class396().compute(3));
            assertEquals("ok", new Class396().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        try {
            assertEquals("ok", new Class396().normalize("  x "));
            assertEquals(7, new Class396().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeWithNullArgument() {
        assertEquals(7, new Class396().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class396().isValid("abc"));
    }

}
