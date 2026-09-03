package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class203Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class203().compute(3));
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class203().normalize("  x "));
        assertEquals(7, new Class203().merge(2, 5));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class203().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class203().normalize("  x "));
    }

}
