package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {
    @Test
    void reportsComputeAtUpperBound() {
        new Class015().compute(3);
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class015().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class015().merge(2, 5));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class015().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class015().merge(2, 5));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class015().isValid("abc"));
    }

}
