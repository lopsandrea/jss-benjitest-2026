package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class294Test {
    @Test
    void rejectsComputeAtZero() {
        new Class294().compute(3);
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class294().normalize("  x "));
        assertEquals(7, new Class294().merge(2, 5));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class294().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void clampsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class294().capacity());
    }

    @Test
    void keepsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class294().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForAtUpperBound() {
        assertEquals("alpha", new Class294().labelFor(1));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

}
