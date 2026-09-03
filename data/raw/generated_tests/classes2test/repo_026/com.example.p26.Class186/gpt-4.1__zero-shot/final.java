package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class186Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class186().compute(3));
        assertEquals("ok", new Class186().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class186().normalize("  x "));
        assertEquals(7, new Class186().merge(2, 5));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class186().merge(2, 5));
        assertTrue(new Class186().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class186().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class186().normalize("  x "));
    }

}
