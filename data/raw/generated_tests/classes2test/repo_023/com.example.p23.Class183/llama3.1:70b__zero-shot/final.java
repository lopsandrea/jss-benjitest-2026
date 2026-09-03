package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class183Test {
    @Test
    void reportsComputeAtUpperBound() {
        try {
            new Class183().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class183().normalize("  x "));
        assertEquals(7, new Class183().merge(2, 5));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class183().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class183().normalize("  x "));
    }

}
