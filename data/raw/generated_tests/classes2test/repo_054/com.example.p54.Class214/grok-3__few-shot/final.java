package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class214Test {
    @Test
    void returnsComputeForBoundaryValue() {
        assertEquals(42, new Class214().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class214().merge(2, 5));
    }

    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class214().compute(3));
    }

}
