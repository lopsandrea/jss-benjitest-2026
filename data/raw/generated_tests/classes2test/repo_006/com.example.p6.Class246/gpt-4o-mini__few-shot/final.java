package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class246Test {
    @Test
    void keepsComputeAtUpperBound() {
        new Class246().compute(3);
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class246().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class246().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class246().merge(2, 5));
    }

}
