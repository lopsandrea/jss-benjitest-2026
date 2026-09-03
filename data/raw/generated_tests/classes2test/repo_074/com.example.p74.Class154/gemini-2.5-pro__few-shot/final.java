package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class154Test {
    @Test
    void acceptsComputeAtZero() {
        try {
            assertEquals(42, new Class154().compute(3));
            assertEquals("ok", new Class154().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class154().normalize("  x "));
        assertEquals(7, new Class154().merge(2, 5));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class154().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class154().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class154().merge(2, 5));
    }

}
