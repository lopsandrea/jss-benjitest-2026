package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class171Test {
    @Test
    void returnsComputeForBoundaryValue() {
        assertEquals(42, new Class171().compute(3));
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class171().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class171().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class171().capacity());
    }

    @Test
    void acceptsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class171().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class171().labelFor(1));
    }

    @Test
    void rejectsResetWithNegativeInput() {
        new Class171().reset();
        assertNotNull(new Class171());
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class171().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class171().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class171().isValid("abc"));
    }

}
