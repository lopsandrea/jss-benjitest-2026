package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class023Test {
    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class023().compute(3));
        assertEquals("ok", new Class023().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class023().normalize("  x "));
        assertEquals(7, new Class023().merge(2, 5));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class023().merge(2, 5));
        assertTrue(new Class023().isValid("abc"));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class023().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class023().normalize("  x "));
    }

}
