package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class113Test {
    @Test
    void reportsComputeAtZero() {
        try {
            new Class113().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class113().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class113().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class113().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class113().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class113().capacity());
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class113().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class113().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class113().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class113().isValid("abc"));
    }

}
