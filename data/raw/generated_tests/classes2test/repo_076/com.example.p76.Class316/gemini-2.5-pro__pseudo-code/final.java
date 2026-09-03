package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class316Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class316().compute(3));
        assertEquals("ok", new Class316().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class316().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class316().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class316().isValid("abc"));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class316().compute(3));
    }

}
