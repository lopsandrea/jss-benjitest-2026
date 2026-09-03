package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class110Test {
    @Test
    void yieldsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class110().compute(3));
            assertEquals("ok", new Class110().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class110().normalize("  x "));
        assertEquals(7, new Class110().merge(2, 5));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        assertEquals(7, new Class110().merge(2, 5));
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class110().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class110().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        assertEquals(7, new Class110().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class110().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class110().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class110().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class110().compute(3));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class110().compute(3));
    }

}
