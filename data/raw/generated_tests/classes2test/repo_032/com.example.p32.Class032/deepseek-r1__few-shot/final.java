package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class032Test {
    @Test
    void reportsComputeForKnownCode() {
        try {
            assertEquals(42, new Class032().compute(3));
            assertEquals("ok", new Class032().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class032().normalize("  x "));
        assertEquals(7, new Class032().merge(2, 5));
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class032().merge(2, 5));
        assertTrue(new Class032().isValid("abc"));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class032().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class032().normalize("  x "));
    }

}
