package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class238Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class238().compute(3));
            assertEquals("ok", new Class238().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class238().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class238().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class238().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class238().capacity());
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class238().compute(3));
    }

}
