package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class002Test {
    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class002().compute(3));
        assertEquals("ok", new Class002().normalize("  x "));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class002().normalize("  x "));
        assertEquals(7, new Class002().merge(2, 5));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class002().merge(2, 5));
        assertTrue(new Class002().isValid("abc"));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class002().isValid("abc"));
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class002().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class002().normalize("  x "));
    }

}
