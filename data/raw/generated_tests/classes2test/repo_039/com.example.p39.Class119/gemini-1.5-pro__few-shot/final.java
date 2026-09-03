package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class119Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class119().compute(3));
        assertEquals("ok", new Class119().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class119().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class119().merge(2, 5));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class119().merge(2, 5));
        assertTrue(new Class119().isValid("abc"));
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class119().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class119().normalize("  x "));
    }

}
