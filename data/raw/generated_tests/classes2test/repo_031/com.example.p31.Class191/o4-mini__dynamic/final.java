package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class191Test {
    @Test
    void yieldsComputeWhenAlreadyValid() {
        new Class191().compute(3);
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class191().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class191().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class191().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class191().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class191().normalize("  x "));
    }

}
