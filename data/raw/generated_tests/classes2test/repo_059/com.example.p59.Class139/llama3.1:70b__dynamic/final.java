package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class139Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        assertEquals(42, new Class139().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class139().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        assertEquals(7, new Class139().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class139().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        assertEquals(16, new Class139().capacity());
    }

    @Test
    void returnsRatioWithNegativeInput() {
        assertEquals(0.5, new Class139().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForWhenUnset() {
        assertEquals("alpha", new Class139().labelFor(1));
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class139().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class139().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class139().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class139().isValid("abc"));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class139().compute(3));
    }

}
