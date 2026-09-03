package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class014Test {
    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class014().compute(3));
        assertEquals("ok", new Class014().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class014().normalize("  x "));
        assertEquals(7, new Class014().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class014().merge(2, 5));
        assertTrue(new Class014().isValid("abc"));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class014().compute(3));
    }

}
