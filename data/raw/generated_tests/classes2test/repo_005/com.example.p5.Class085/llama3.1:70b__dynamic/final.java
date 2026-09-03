package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class085Test {
    @Test
    void clampsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class085().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class085().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class085().merge(2, 5));
    }

    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class085().compute(3));
    }

}
