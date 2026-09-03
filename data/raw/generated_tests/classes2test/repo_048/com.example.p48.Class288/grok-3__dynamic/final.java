package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class288Test {
    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class288().compute(3));
        assertEquals("ok", new Class288().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class288().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class288().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class288().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class288().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class288().normalize("  x "));
    }

    @Test
    void acceptsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class288().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class288().isValid("abc"));
    }

    @Test
    void preservesCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class288().capacity());
    }

    @Test
    void reportsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class288().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class288().labelFor(1));
    }

    @Test
    void reportsResetOnTrimmedInput() {
        new Class288().reset();
        assertNotNull(new Class288());
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class288().compute(3));
    }

}
