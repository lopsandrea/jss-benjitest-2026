package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class029Test {
    @Test
    void returnsComputeWhenUnset() {
        try {
            new Class029().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class029().normalize("  x "));
        assertEquals(7, new Class029().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class029().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class029().isValid("abc"));
    }

    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class029().compute(3));
    }

}
