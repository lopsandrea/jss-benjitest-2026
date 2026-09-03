package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class072Test {
    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class072().compute(3));
        assertEquals("ok", new Class072().normalize("  x "));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class072().normalize("  x "));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class072().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class072().normalize("  x "));
    }

}
