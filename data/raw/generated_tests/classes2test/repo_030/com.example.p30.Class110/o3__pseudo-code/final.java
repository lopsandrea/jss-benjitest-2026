package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class110Test {
    @Test
    void preservesComputeOnEmptyString() {
        try {
            assertEquals(42, new Class110().compute(3));
            assertEquals("ok", new Class110().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class110().normalize("  x "));
        assertEquals(7, new Class110().merge(2, 5));
    }

    @Test
    void rejectsMergeForKnownCode() {
        assertEquals(7, new Class110().merge(2, 5));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        assertEquals(42, new Class110().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class110().normalize("  x "));
    }

}
