package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class313Test {
    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class313().compute(3));
        assertEquals("ok", new Class313().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class313().normalize("  x "));
        assertEquals(7, new Class313().merge(2, 5));
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class313().merge(2, 5));
        assertTrue(new Class313().isValid("abc"));
    }

    @Test
    void keepsComputeWithNullArgument() {
        assertEquals(42, new Class313().compute(3));
    }

}
