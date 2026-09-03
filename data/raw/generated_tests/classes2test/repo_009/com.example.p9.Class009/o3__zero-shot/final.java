package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class009Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        assertEquals(42, new Class009().compute(3));
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class009().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class009().merge(2, 5));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class009().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class009().normalize("  x "));
    }

}
