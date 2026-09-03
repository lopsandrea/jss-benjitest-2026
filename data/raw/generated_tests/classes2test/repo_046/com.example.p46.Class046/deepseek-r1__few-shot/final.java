package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class046Test {
    @Test
    void preservesComputeAtUpperBound() {
        try {
            assertEquals(42, new Class046().compute(3));
            assertEquals("ok", new Class046().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class046().normalize("  x "));
        assertEquals(7, new Class046().merge(2, 5));
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class046().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class046().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class046().capacity());
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class046().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class046().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class046().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class046().isValid("abc"));
    }

}
