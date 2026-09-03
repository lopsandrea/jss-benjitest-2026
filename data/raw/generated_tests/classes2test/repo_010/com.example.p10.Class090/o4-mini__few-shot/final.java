package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class090Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class090().compute(3));
            assertEquals("ok", new Class090().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class090().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class090().merge(2, 5));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class090().merge(2, 5));
        assertTrue(new Class090().isValid("abc"));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class090().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class090().capacity());
    }

}
