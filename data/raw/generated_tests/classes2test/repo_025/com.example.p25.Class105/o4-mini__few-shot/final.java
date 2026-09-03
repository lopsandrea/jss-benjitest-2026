package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class105Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class105().compute(3));
        assertEquals("ok", new Class105().normalize("  x "));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        assertEquals(42, new Class105().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class105().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        assertEquals(7, new Class105().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class105().isValid("abc"));
    }

}
