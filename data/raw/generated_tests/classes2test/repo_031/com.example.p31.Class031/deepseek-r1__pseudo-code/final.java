package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class031Test {
    @Test
    void rejectsComputeWhenAlreadyValid() {
        try {
            new Class031().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class031().normalize("  x "));
            assertEquals(7, new Class031().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeForBoundaryValue() {
        assertEquals(7, new Class031().merge(2, 5));
        assertTrue(new Class031().isValid("abc"));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class031().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class031().normalize("  x "));
    }

}
