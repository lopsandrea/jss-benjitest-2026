package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class236Test {
    @Test
    void acceptsComputeWhenUnset() {
        try {
            assertEquals(42, new Class236().compute(3));
            assertEquals("ok", new Class236().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class236().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class236().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        assertEquals(7, new Class236().merge(2, 5));
    }

}
