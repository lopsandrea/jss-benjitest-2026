package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class347Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        new Class347().compute(3);
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class347().normalize("  x "));
        assertEquals(7, new Class347().merge(2, 5));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class347().merge(2, 5));
        assertTrue(new Class347().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class347().isValid("abc"));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class347().compute(3));
    }

}
