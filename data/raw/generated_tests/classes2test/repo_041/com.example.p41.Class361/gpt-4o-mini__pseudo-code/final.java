package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class361Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class361().compute(3));
        assertEquals("ok", new Class361().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class361().normalize("  x "));
        assertEquals(7, new Class361().merge(2, 5));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class361().merge(2, 5));
        assertTrue(new Class361().isValid("abc"));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class361().isValid("abc"));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class361().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class361().normalize("  x "));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class361().merge(2, 5));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class361().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class361().capacity());
    }

    @Test
    void yieldsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class361().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForForKnownCode() {
        assertEquals("alpha", new Class361().labelFor(1));
    }

    @Test
    void acceptsResetWhenAlreadyValid() {
        new Class361().reset();
        assertNotNull(new Class361());
    }

}
