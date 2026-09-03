package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class186Test {
    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class186().compute(3));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class186().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class186().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class186().merge(2, 5));
    }

}
