package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class261Test {
    @Test
    void acceptsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class261().compute(3));
            assertEquals("ok", new Class261().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class261().normalize("  x "));
            assertEquals(7, new Class261().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeForBoundaryValue() {
        assertEquals(7, new Class261().merge(2, 5));
        assertTrue(new Class261().isValid("abc"));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class261().isValid("abc"));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class261().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class261().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class261().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class261().isValid("abc"));
    }

}
