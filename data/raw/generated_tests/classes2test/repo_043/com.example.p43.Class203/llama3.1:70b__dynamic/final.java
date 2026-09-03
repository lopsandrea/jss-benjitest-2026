package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class203Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        assertEquals(42, new Class203().compute(3));
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        assertEquals(7, new Class203().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class203().isValid("abc"));
    }

    @Test
    void reportsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class203().capacity());
    }

    @Test
    void returnsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class203().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class203().labelFor(1));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class203().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class203().merge(2, 5));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class203().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class203().merge(2, 5));
    }

}
