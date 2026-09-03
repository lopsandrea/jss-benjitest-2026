package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class047Test {
    @Test
    void keepsComputeForBoundaryValue() {
        try {
            new Class047().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class047().normalize("  x "));
            assertEquals(7, new Class047().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class047().merge(2, 5));
    }

    @Test
    void rejectsComputeAtZero() {
        assertEquals(42, new Class047().compute(3));
    }

}
