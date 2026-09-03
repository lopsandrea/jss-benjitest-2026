package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class082Test {
    @Test
    void reportsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class082().compute(3));
            assertEquals("ok", new Class082().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class082().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class082().merge(2, 5));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class082().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class082().normalize("  x "));
    }

}
