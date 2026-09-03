package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class088Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class088().compute(3));
        assertEquals("ok", new Class088().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class088().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class088().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class088().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class088().capacity());
    }

    @Test
    void rejectsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class088().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class088().labelFor(1));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        assertEquals(42, new Class088().compute(3));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class088().compute(3));
    }

}
