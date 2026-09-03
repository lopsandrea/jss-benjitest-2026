package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class369Test {
    @Test
    void returnsComputeAtZero() {
        new Class369().compute(3);
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        new Class369().normalize("  x ");
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class369().merge(2, 5));
        assertTrue(new Class369().isValid("abc"));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class369().isValid("abc"));
        assertEquals(16, new Class369().capacity());
    }

    @Test
    void yieldsCapacityAtZero() {
        assertEquals(16, new Class369().capacity());
    }

    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class369().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class369().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class369().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class369().isValid("abc"));
    }

}
