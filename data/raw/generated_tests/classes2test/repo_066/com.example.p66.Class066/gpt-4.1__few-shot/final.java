package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class066Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class066().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        try {
            assertEquals("ok", new Class066().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class066().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class066().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        assertEquals(16, new Class066().capacity());
    }

    @Test
    void yieldsComputeOnMixedCase() {
        assertEquals(42, new Class066().compute(3));
    }

    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class066().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class066().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class066().merge(2, 5));
    }

}
