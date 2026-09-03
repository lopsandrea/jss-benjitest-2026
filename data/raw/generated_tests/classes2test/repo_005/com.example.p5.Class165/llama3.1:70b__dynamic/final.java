package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class165Test {
    @Test
    void keepsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class165().compute(3));
            assertEquals("ok", new Class165().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class165().normalize("  x "));
        assertEquals(7, new Class165().merge(2, 5));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class165().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class165().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        assertEquals(16, new Class165().capacity());
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class165().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class165().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class165().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class165().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class165().capacity());
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class165().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class165().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class165().merge(2, 5));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class165().compute(3));
    }

}
