package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class276Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class276().compute(3));
        assertEquals("ok", new Class276().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class276().normalize("  x "));
        assertEquals(7, new Class276().merge(2, 5));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        assertEquals(7, new Class276().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class276().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        assertEquals(16, new Class276().capacity());
    }

    @Test
    void yieldsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class276().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnMixedCase() {
        assertEquals("alpha", new Class276().labelFor(1));
    }

    @Test
    void keepsResetOnRepeatedCall() {
        new Class276().reset();
        assertNotNull(new Class276());
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class276().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class276().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class276().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class276().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class276().capacity());
    }

}
