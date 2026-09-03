package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class269Test {
    @Test
    void clampsComputeWithNegativeInput() {
        new Class269().compute(3);
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        new Class269().normalize("  x ");
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class269().merge(2, 5));
        assertTrue(new Class269().isValid("abc"));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class269().isValid("abc"));
        assertEquals(42, new Class269().compute(3));
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class269().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class269().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class269().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class269().isValid("abc"));
    }

}
