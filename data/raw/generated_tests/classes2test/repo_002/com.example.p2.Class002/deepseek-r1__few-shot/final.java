package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class002Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        new Class002().compute(3);
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class002().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class002().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class002().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        assertEquals(16, new Class002().capacity());
    }

    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class002().compute(3));
    }

}
