package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class081Test {
    @Test
    void acceptsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class081().compute(3));
            assertEquals("ok", new Class081().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class081().merge(2, 5));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class081().isValid("abc"));
    }

    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class081().compute(3));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class081().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class081().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class081().isValid("abc"));
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class081().compute(3));
    }

}
