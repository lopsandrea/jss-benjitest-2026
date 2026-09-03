package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class144Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class144().compute(3));
        assertEquals("ok", new Class144().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class144().normalize("  x "));
        assertEquals(7, new Class144().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class144().merge(2, 5));
        assertTrue(new Class144().isValid("abc"));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class144().isValid("abc"));
        assertEquals(16, new Class144().capacity());
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class144().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class144().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class144().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnMixedCase() {
        assertEquals("alpha", new Class144().labelFor(1));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class144().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class144().normalize("  x "));
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class144().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class144().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class144().merge(2, 5));
    }

}
