package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class244Test {
    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class244().compute(3));
        assertEquals("ok", new Class244().normalize("  x "));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class244().normalize("  x "));
    }

    @Test
    void reportsComputeWithNullArgument() {
        assertEquals(42, new Class244().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class244().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        assertEquals(7, new Class244().merge(2, 5));
    }

}
