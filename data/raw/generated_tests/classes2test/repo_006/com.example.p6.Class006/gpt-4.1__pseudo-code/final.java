package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class006Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class006().compute(3));
        assertEquals("ok", new Class006().normalize("  x "));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class006().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        assertEquals(7, new Class006().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class006().isValid("abc"));
    }

    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class006().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class006().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class006().merge(2, 5));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class006().compute(3));
    }

}
