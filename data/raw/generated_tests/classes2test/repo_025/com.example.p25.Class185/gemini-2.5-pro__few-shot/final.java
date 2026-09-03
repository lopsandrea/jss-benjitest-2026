package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class185Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class185().compute(3));
        assertEquals("ok", new Class185().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class185().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class185().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class185().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        assertEquals(16, new Class185().capacity());
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class185().compute(3));
    }

}
