package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class286Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class286().compute(3));
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class286().normalize("  x "));
        assertEquals(7, new Class286().merge(2, 5));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class286().merge(2, 5));
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        assertEquals(42, new Class286().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class286().normalize("  x "));
    }

}
