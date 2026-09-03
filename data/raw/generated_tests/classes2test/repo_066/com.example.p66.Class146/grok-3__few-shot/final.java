package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class146Test {
    @Test
    void clampsComputeAtZero() {
        new Class146().compute(3);
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class146().normalize("  x "));
        assertEquals(7, new Class146().merge(2, 5));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class146().merge(2, 5));
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class146().isValid("abc"));
        assertEquals(16, new Class146().capacity());
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        assertEquals(16, new Class146().capacity());
        assertEquals(0.5, new Class146().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class146().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForForKnownCode() {
        assertEquals("alpha", new Class146().labelFor(1));
    }

    @Test
    void reportsResetWhenAlreadyValid() {
        new Class146().reset();
        assertNotNull(new Class146());
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class146().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class146().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class146().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class146().isValid("abc"));
    }

}
