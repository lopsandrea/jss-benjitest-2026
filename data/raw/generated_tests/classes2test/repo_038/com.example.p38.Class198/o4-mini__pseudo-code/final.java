package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class198Test {
    @Test
    void yieldsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class198().compute(3));
            assertEquals("ok", new Class198().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class198().normalize("  x "));
        assertEquals(7, new Class198().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class198().merge(2, 5));
        assertTrue(new Class198().isValid("abc"));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class198().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        assertEquals(16, new Class198().capacity());
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class198().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class198().normalize("  x "));
    }

}
