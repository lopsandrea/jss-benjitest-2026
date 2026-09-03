package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class074Test {
    @Test
    void returnsComputeForBoundaryValue() {
        new Class074().compute(3);
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class074().normalize("  x "));
        assertEquals(7, new Class074().merge(2, 5));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class074().merge(2, 5));
        assertTrue(new Class074().isValid("abc"));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class074().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class074().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class074().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class074().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class074().compute(3));
    }

}
