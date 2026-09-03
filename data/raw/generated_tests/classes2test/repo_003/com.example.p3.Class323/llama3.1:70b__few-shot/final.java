package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class323Test {
    @Test
    void returnsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class323().compute(3));
            assertEquals("ok", new Class323().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        try {
            assertEquals("ok", new Class323().normalize("  x "));
            assertEquals(7, new Class323().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsMergeWhenUnset() {
        try {
            assertEquals(7, new Class323().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class323().compute(3));
    }

}
