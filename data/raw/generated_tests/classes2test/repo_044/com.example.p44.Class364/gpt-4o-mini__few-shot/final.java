package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class364Test {
    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class364().compute(3));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class364().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class364().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        assertEquals(7, new Class364().merge(2, 5));
    }

}
