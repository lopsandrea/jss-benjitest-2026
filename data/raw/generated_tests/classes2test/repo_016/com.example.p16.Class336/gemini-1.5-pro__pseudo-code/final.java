package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class336Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class336().compute(3));
        assertEquals("ok", new Class336().normalize("  x "));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class336().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class336().merge(2, 5));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class336().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class336().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class336().capacity());
    }

    @Test
    void returnsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class336().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class336().compute(3));
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class336().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class336().normalize("  x "));
    }

}
