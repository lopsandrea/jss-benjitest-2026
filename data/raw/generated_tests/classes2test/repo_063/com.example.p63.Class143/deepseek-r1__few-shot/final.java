package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class143Test {
    @Test
    void preservesComputeOnEmptyString() {
        new Class143().compute(3);
    }

    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class143().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class143().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        assertEquals(7, new Class143().merge(2, 5));
    }

}
