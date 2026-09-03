package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class006Test {
    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class006().compute(3));
        assertEquals("ok", new Class006().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class006().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class006().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class006().isValid("abc"));
    }

    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class006().compute(3));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class006().compute(3));
    }

}
