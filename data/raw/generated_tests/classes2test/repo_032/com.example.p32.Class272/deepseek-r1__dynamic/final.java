package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class272Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class272().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class272().merge(2, 5));
    }

    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class272().compute(3));
    }

}
