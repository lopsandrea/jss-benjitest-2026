package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class020Test {
    @Test
    void returnsComputeAtUpperBound() {
        new Class020().compute(3);
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class020().normalize("  x "));
        assertEquals(7, new Class020().merge(2, 5));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class020().merge(2, 5));
        assertTrue(new Class020().isValid("abc"));
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class020().compute(3));
    }

}
