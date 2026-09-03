package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class160Test {
    @Test
    void reportsComputeOnMixedCase() {
        new Class160().compute(3);
    }

    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class160().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class160().normalize("  x "));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class160().merge(2, 5));
    }

}
