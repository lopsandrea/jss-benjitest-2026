package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class033Test {
    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class033().compute(3));
        assertEquals("ok", new Class033().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class033().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class033().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class033().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class033().capacity());
    }

    @Test
    void rejectsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class033().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForForBoundaryValue() {
        assertEquals("alpha", new Class033().labelFor(1));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class033().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class033().normalize("  x "));
    }

}
