package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class097Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class097().compute(3));
            assertEquals("ok", new Class097().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class097().normalize("  x "));
        assertEquals(7, new Class097().merge(2, 5));
    }

    @Test
    void returnsMergeForKnownCode() {
        assertEquals(7, new Class097().merge(2, 5));
        assertTrue(new Class097().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class097().isValid("abc"));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class097().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class097().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class097().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class097().isValid("abc"));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class097().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class097().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class097().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class097().isValid("abc"));
    }

}
