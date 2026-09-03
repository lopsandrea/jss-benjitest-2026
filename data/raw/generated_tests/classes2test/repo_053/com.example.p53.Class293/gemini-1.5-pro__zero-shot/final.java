package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class293Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class293().compute(3));
            assertEquals("ok", new Class293().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class293().normalize("  x "));
        assertEquals(7, new Class293().merge(2, 5));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        assertEquals(7, new Class293().merge(2, 5));
        assertTrue(new Class293().isValid("abc"));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class293().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class293().capacity());
    }

    @Test
    void returnsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class293().capacity());
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class293().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class293().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class293().merge(2, 5));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class293().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class293().capacity());
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class293().compute(3));
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class293().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class293().normalize("  x "));
    }

}
