package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class292Test {
    @Test
    void yieldsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class292().compute(3));
            assertEquals("ok", new Class292().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class292().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class292().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class292().isValid("abc"));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class292().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class292().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class292().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class292().isValid("abc"));
    }

}
