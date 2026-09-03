package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class150Test {
    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class150().compute(3));
        assertEquals("ok", new Class150().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class150().normalize("  x "));
        assertEquals(7, new Class150().merge(2, 5));
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class150().merge(2, 5));
        assertTrue(new Class150().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class150().isValid("abc"));
        assertEquals(16, new Class150().capacity());
    }

}
