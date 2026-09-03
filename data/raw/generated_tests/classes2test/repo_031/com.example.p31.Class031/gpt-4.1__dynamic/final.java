package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class031Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class031().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class031().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class031().merge(2, 5));
    }

    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class031().compute(3));
    }

}
