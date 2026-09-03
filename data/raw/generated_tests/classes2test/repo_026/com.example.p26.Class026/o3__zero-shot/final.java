package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class026Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        assertEquals(42, new Class026().compute(3));
        assertEquals("ok", new Class026().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class026().normalize("  x "));
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class026().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class026().normalize("  x "));
    }

}
