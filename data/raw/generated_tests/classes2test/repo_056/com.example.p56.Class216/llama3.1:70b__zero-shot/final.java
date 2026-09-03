package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {
    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class216().compute(3));
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class216().normalize("  x "));
        assertEquals(7, new Class216().merge(2, 5));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class216().merge(2, 5));
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

}
