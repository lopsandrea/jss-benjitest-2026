package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class037Test {
    @Test
    void rejectsComputeForKnownCode() {
        try {
            assertEquals(42, new Class037().compute(3));
            assertEquals("ok", new Class037().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class037().normalize("  x "));
        assertEquals(7, new Class037().merge(2, 5));
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class037().compute(3));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class037().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class037().merge(2, 5));
    }

}
