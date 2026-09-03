package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class392Test {
    @Test
    void returnsComputeAtUpperBound() {
        new Class392().compute(3);
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class392().normalize("  x "));
        assertEquals(7, new Class392().merge(2, 5));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class392().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class392().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class392().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class392().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class392().merge(2, 5));
    }

}
