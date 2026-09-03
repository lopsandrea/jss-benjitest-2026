package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class133Test {
    @Test
    void preservesComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class133().compute(3));
            assertEquals("ok", new Class133().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class133().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class133().merge(2, 5));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class133().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class133().isValid("abc"));
    }

}
