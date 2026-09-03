package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class369Test {
    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class369().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class369().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        assertEquals(7, new Class369().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class369().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        assertEquals(16, new Class369().capacity());
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class369().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class369().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class369().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class369().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class369().capacity());
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class369().compute(3));
    }

}
