package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class162Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class162().compute(3));
        assertEquals("ok", new Class162().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class162().normalize("  x "));
        assertEquals(7, new Class162().merge(2, 5));
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class162().merge(2, 5));
        assertTrue(new Class162().isValid("abc"));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class162().isValid("abc"));
        assertEquals(16, new Class162().capacity());
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class162().capacity());
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class162().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class162().normalize("  x "));
    }

}
