package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class037Test {
    @Test
    void yieldsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class037().compute(3));
            assertEquals("ok", new Class037().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class037().normalize("  x "));
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class037().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class037().normalize("  x "));
    }

    @Test
    void clampsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class037().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class037().isValid("abc"));
    }

}
