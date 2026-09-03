package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class182Test {
    @Test
    void reportsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class182().compute(3));
            assertEquals("ok", new Class182().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class182().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class182().merge(2, 5));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class182().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class182().normalize("  x "));
    }

}
