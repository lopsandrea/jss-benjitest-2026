package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class369Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class369().compute(3));
            assertEquals("ok", new Class369().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class369().normalize("  x "));
        assertEquals(7, new Class369().merge(2, 5));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class369().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class369().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class369().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class369().isValid("abc"));
    }

    @Test
    void keepsCapacityOnEmptyString() {
        assertEquals(16, new Class369().capacity());
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class369().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class369().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class369().merge(2, 5));
    }

}
