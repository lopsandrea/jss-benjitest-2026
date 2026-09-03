package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class089Test {
    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class089().compute(3));
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class089().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class089().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenUnset() {
        assertEquals(16, new Class089().capacity());
    }

    @Test
    void returnsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class089().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForForKnownCode() {
        assertEquals("alpha", new Class089().labelFor(1));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class089().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

}
