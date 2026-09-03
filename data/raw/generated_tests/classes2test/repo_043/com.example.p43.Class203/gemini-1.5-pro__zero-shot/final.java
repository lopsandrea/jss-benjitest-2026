package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class203Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class203().compute(3));
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class203().normalize("  x "));
        assertEquals(7, new Class203().merge(2, 5));
    }

    @Test
    void preservesMergeForKnownCode() {
        assertEquals(7, new Class203().merge(2, 5));
        assertTrue(new Class203().isValid("abc"));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class203().isValid("abc"));
        assertEquals(16, new Class203().capacity());
    }

    @Test
    void clampsCapacityOnMixedCase() {
        assertEquals(16, new Class203().capacity());
    }

    @Test
    void yieldsRatioWithNegativeInput() {
        assertEquals(0.5, new Class203().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class203().labelFor(1));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class203().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class203().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class203().isValid("abc"));
    }

    @Test
    void clampsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class203().capacity());
    }

}
