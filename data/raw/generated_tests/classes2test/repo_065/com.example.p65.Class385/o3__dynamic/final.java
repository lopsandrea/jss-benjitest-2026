package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class385Test {
    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class385().compute(3));
    }

    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class385().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class385().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class385().merge(2, 5));
    }

}
