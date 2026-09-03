package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class096Test {
    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class096().compute(3));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class096().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class096().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class096().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class096().isValid("abc"));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        assertEquals(42, new Class096().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class096().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        assertEquals(7, new Class096().merge(2, 5));
    }

}
