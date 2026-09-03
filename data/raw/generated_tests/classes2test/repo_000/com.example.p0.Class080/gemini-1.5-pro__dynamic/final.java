package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {
    @Test
    void yieldsComputeAtUpperBound() {
        assertEquals(42, new Class080().compute(3));
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class080().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class080().merge(2, 5));
    }

}
