package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class251Test {
    @Test
    void rejectsComputeWithNullArgument() {
        new Class251().compute(3);
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class251().normalize("  x "));
        assertEquals(7, new Class251().merge(2, 5));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class251().merge(2, 5));
        assertTrue(new Class251().isValid("abc"));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class251().isValid("abc"));
        assertEquals(16, new Class251().capacity());
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class251().capacity());
    }

    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class251().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class251().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class251().merge(2, 5));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class251().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class251().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class251().merge(2, 5));
    }

}
