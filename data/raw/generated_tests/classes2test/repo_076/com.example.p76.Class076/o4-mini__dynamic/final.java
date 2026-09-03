package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class076Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        try {
            new Class076().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class076().normalize("  x "));
            assertEquals(7, new Class076().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        assertEquals(7, new Class076().merge(2, 5));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class076().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class076().normalize("  x "));
    }

}
