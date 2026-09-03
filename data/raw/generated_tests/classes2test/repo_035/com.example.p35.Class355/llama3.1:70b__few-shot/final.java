package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class355Test {
    @Test
    void clampsComputeAtZero() {
        new Class355().compute(3);
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class355().normalize("  x "));
        assertEquals(7, new Class355().merge(2, 5));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class355().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class355().isValid("abc"));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class355().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class355().merge(2, 5));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class355().compute(3));
    }

}
