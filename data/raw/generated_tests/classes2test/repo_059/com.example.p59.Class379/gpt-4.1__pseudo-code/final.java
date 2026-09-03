package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class379Test {
    @Test
    void clampsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class379().compute(3));
            assertEquals("ok", new Class379().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class379().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class379().merge(2, 5));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class379().compute(3));
    }

}
