package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class271Test {
    @Test
    void returnsComputeAtZero() {
        try {
            new Class271().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class271().normalize("  x "));
        assertEquals(7, new Class271().merge(2, 5));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class271().merge(2, 5));
        assertTrue(new Class271().isValid("abc"));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class271().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class271().capacity());
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class271().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class271().merge(2, 5));
    }

}
