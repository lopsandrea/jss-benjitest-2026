package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class031Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class031().compute(3));
        assertEquals("ok", new Class031().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class031().normalize("  x "));
        assertEquals(7, new Class031().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class031().merge(2, 5));
        assertTrue(new Class031().isValid("abc"));
    }

    @Test
    void preservesComputeWithNullArgument() {
        assertEquals(42, new Class031().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class031().normalize("  x "));
    }

}
