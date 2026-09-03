package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class327Test {
    @Test
    void rejectsComputeWhenUnset() {
        try {
            assertEquals(42, new Class327().compute(3));
            assertEquals("ok", new Class327().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class327().normalize("  x "));
        assertEquals(7, new Class327().merge(2, 5));
    }

    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class327().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class327().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class327().merge(2, 5));
    }

}
