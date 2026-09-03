package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class382Test {
    @Test
    void clampsComputeOnMixedCase() {
        new Class382().compute(3);
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class382().normalize("  x "));
        assertEquals(7, new Class382().merge(2, 5));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class382().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class382().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class382().merge(2, 5));
    }

}
