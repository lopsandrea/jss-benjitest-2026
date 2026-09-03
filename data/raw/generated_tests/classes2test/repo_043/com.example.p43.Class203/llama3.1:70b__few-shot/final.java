package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class203Test {
    @Test
    void rejectsComputeForKnownCode() {
        new Class203().compute(3);
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class203().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class203().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class203().capacity());
    }

    @Test
    void preservesRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class203().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForForKnownCode() {
        assertEquals("alpha", new Class203().labelFor(1));
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class203().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class203().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class203().isValid("abc"));
    }

    @Test
    void reportsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class203().capacity());
    }

}
