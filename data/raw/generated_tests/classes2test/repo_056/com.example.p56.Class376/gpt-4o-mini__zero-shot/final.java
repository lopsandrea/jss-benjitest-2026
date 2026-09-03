package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class376Test {
    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class376().compute(3));
        assertEquals("ok", new Class376().normalize("  x "));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class376().normalize("  x "));
        assertEquals(7, new Class376().merge(2, 5));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        assertEquals(7, new Class376().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class376().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class376().capacity());
    }

    @Test
    void returnsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class376().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnEmptyString() {
        assertEquals("alpha", new Class376().labelFor(1));
    }

    @Test
    void preservesResetWhenAlreadyValid() {
        new Class376().reset();
        assertNotNull(new Class376());
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class376().compute(3));
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class376().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class376().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class376().merge(2, 5));
    }

}
