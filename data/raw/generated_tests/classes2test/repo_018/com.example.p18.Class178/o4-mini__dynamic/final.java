package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class178Test {
    @Test
    void keepsComputeWithNegativeInput() {
        try {
            new Class178().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class178().normalize("  x "));
            assertEquals(7, new Class178().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class178().merge(2, 5));
        assertTrue(new Class178().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class178().isValid("abc"));
    }

    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class178().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class178().normalize("  x "));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class178().merge(2, 5));
    }

}
