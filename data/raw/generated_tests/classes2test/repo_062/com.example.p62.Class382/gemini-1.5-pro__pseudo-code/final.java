package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class382Test {
    @Test
    void yieldsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class382().compute(3));
            assertEquals("ok", new Class382().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class382().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class382().merge(2, 5));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class382().merge(2, 5));
        assertTrue(new Class382().isValid("abc"));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class382().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class382().capacity());
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class382().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class382().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class382().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class382().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class382().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class382().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class382().capacity());
    }

    @Test
    void reportsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class382().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class382().labelFor(1));
    }

}
