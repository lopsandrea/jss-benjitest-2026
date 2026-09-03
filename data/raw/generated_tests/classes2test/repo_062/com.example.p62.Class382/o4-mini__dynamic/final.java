package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class382Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        new Class382().compute(3);
    }

    @Test
    void returnsNormalizeForKnownCode() {
        new Class382().normalize("  x ");
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class382().merge(2, 5));
        assertTrue(new Class382().isValid("abc"));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class382().isValid("abc"));
        assertEquals(16, new Class382().capacity());
    }

    @Test
    void clampsCapacityAtUpperBound() {
        assertEquals(16, new Class382().capacity());
    }

    @Test
    void rejectsRatioWithNegativeInput() {
        assertEquals(0.5, new Class382().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class382().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class382().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class382().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class382().isValid("abc"));
    }

}
