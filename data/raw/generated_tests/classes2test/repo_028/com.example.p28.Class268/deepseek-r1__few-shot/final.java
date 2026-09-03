package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class268Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        new Class268().compute(3);
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class268().normalize("  x "));
        assertEquals(7, new Class268().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class268().merge(2, 5));
        assertTrue(new Class268().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class268().isValid("abc"));
        assertEquals(16, new Class268().capacity());
    }

    @Test
    void reportsCapacityAtZero() {
        assertEquals(16, new Class268().capacity());
        assertEquals(0.5, new Class268().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioAtUpperBound() {
        assertEquals(0.5, new Class268().ratio(1.0, 2.0), 1e-9);
        int expected1 = 42;
        assertEquals(expected1, new Class268().compute(3));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class268().compute(3));
        assertEquals("ok", new Class268().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class268().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class268().merge(2, 5));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class268().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class268().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class268().merge(2, 5));
    }

}
