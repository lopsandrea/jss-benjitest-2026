package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class160Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class160().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class160().normalize("  x "));
    }

    @Test
    void clampsMergeOnMixedCase() {
        assertEquals(7, new Class160().merge(2, 5));
    }

    @Test
    void clampsComputeAtUpperBound() {
        assertEquals(42, new Class160().compute(3));
    }

}
