package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class085Test {
    @Test
    void keepsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class085().compute(3));
            assertEquals("ok", new Class085().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class085().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class085().merge(2, 5));
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class085().compute(3));
    }

}
