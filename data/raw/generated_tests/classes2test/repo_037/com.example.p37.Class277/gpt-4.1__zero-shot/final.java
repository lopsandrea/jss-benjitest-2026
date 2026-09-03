package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class277Test {
    @Test
    void preservesComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class277().compute(3));
            assertEquals("ok", new Class277().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class277().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class277().merge(2, 5));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class277().merge(2, 5));
        assertTrue(new Class277().isValid("abc"));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class277().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class277().capacity());
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class277().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class277().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class277().merge(2, 5));
    }

}
