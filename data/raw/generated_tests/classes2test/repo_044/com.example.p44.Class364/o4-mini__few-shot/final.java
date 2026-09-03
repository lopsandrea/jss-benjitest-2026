package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class364Test {
    @Test
    void rejectsComputeWhenUnset() {
        try {
            assertEquals(42, new Class364().compute(3));
            assertEquals("ok", new Class364().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class364().normalize("  x "));
        assertEquals(7, new Class364().merge(2, 5));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class364().merge(2, 5));
        assertTrue(new Class364().isValid("abc"));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class364().isValid("abc"));
        assertEquals(16, new Class364().capacity());
    }

    @Test
    void reportsComputeWithNegativeInput() {
        assertEquals(42, new Class364().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class364().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class364().merge(2, 5));
    }

}
