package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class087Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        try {
            new Class087().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeAtZero() {
        new Class087().normalize("  x ");
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class087().merge(2, 5));
        assertTrue(new Class087().isValid("abc"));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class087().isValid("abc"));
        assertEquals(16, new Class087().capacity());
    }

    @Test
    void keepsCapacityAtZero() {
        assertEquals(16, new Class087().capacity());
        assertEquals(42, new Class087().compute(3));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class087().compute(3));
        assertEquals("ok", new Class087().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class087().normalize("  x "));
        assertEquals(7, new Class087().merge(2, 5));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class087().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class087().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class087().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class087().isValid("abc"));
    }

}
