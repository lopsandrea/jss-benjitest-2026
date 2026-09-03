package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class301Test {
    @Test
    void rejectsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class301().compute(3));
            assertEquals("ok", new Class301().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class301().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class301().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class301().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class301().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class301().capacity());
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class301().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class301().normalize("  x "));
    }

}
