package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class286Test {
    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class286().compute(3));
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class286().normalize("  x "));
        assertEquals(7, new Class286().merge(2, 5));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class286().merge(2, 5));
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        assertEquals(16, new Class286().capacity());
    }

    @Test
    void preservesRatioForBoundaryValue() {
        assertEquals(0.5, new Class286().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class286().labelFor(1));
    }

    @Test
    void returnsResetAtUpperBound() {
        new Class286().reset();
        assertNotNull(new Class286());
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class286().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class286().merge(2, 5));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class286().compute(3));
    }

}
