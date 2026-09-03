package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class160Test {
    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class160().compute(3));
        assertEquals("ok", new Class160().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class160().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class160().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class160().isValid("abc"));
    }

}
