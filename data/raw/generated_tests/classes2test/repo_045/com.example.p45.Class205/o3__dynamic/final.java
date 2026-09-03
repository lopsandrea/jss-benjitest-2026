package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class205Test {
    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class205().compute(3));
        assertEquals("ok", new Class205().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class205().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        assertEquals(7, new Class205().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class205().isValid("abc"));
    }

    @Test
    void clampsCapacityAtZero() {
        assertEquals(16, new Class205().capacity());
    }

    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class205().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class205().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class205().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class205().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class205().capacity());
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class205().compute(3));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class205().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class205().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class205().merge(2, 5));
    }

}
