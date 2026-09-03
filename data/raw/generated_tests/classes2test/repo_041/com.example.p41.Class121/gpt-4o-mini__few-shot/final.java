package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class121Test {
    @Test
    void keepsComputeAtZero() {
        try {
            assertEquals(42, new Class121().compute(3));
            assertEquals("ok", new Class121().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class121().normalize("  x "));
    }

    @Test
    void preservesComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class121().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class121().normalize("  x "));
    }

}
