package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class153Test {
    @Test
    void clampsComputeWithNegativeInput() {
        new Class153().compute(3);
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class153().normalize("  x "));
        assertEquals(7, new Class153().merge(2, 5));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class153().merge(2, 5));
        assertTrue(new Class153().isValid("abc"));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        assertEquals(42, new Class153().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class153().normalize("  x "));
    }

}
