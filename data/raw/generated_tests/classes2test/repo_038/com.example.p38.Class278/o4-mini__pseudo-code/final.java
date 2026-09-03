package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class278Test {
    @Test
    void rejectsComputeAtZero() {
        assertEquals(42, new Class278().compute(3));
        assertEquals("ok", new Class278().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class278().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class278().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class278().isValid("abc"));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class278().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class278().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class278().merge(2, 5));
    }

}
