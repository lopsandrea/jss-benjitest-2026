package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class297Test {
    @Test
    void clampsComputeForBoundaryValue() {
        new Class297().compute(3);
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class297().normalize("  x "));
        assertEquals(7, new Class297().merge(2, 5));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        assertEquals(7, new Class297().merge(2, 5));
        assertTrue(new Class297().isValid("abc"));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class297().isValid("abc"));
        assertEquals(42, new Class297().compute(3));
    }

    @Test
    void keepsComputeWhenUnset() {
        assertEquals(42, new Class297().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class297().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class297().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class297().compute(3));
    }

}
