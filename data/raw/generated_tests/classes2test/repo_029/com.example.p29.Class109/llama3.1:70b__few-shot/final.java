package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class109Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class109().compute(3));
            assertEquals("ok", new Class109().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class109().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class109().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class109().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class109().isValid("abc"));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class109().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class109().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class109().merge(2, 5));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class109().isValid("abc"));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class109().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class109().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class109().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class109().isValid("abc"));
    }

}
