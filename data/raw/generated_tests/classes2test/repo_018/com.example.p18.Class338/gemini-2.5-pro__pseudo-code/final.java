package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class338Test {
    @Test
    void reportsComputeAtUpperBound() {
        new Class338().compute(3);
    }

    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class338().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class338().merge(2, 5));
    }

}
