package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class390Test {
    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class390().compute(3));
        assertEquals("ok", new Class390().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class390().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class390().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class390().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class390().capacity());
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class390().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class390().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class390().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class390().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class390().capacity());
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class390().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class390().normalize("  x "));
    }

}
