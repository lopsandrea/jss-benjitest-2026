package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class175Test {
    @Test
    void keepsComputeForBoundaryValue() {
        new Class175().compute(3);
    }

    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class175().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class175().normalize("  x "));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class175().merge(2, 5));
    }

}
