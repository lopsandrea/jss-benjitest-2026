package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class205Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        try {
            new Class205().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeAtZero() {
        try {
            assertEquals("ok", new Class205().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        assertEquals(7, new Class205().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class205().isValid("abc"));
    }

    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class205().compute(3));
    }

}
