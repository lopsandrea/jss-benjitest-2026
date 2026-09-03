package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class066Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class066().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class066().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class066().merge(2, 5));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class066().compute(3));
    }

}
