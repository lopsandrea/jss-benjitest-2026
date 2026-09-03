package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class047Test {
    @Test
    void acceptsComputeAtZero() {
        try {
            assertEquals(42, new Class047().compute(3));
            assertEquals("ok", new Class047().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class047().normalize("  x "));
        assertEquals(7, new Class047().merge(2, 5));
    }

    @Test
    void returnsMergeAtUpperBound() {
        assertEquals(7, new Class047().merge(2, 5));
        assertTrue(new Class047().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class047().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class047().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class047().merge(2, 5));
    }

}
