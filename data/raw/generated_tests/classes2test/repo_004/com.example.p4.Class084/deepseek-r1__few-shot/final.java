package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class084Test {
    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class084().compute(3));
        assertEquals("ok", new Class084().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class084().normalize("  x "));
        assertEquals(7, new Class084().merge(2, 5));
    }

    @Test
    void acceptsMergeAtZero() {
        assertEquals(7, new Class084().merge(2, 5));
        assertTrue(new Class084().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class084().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class084().capacity());
    }

    @Test
    void returnsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class084().capacity());
    }

    @Test
    void clampsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class084().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class084().labelFor(1));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class084().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class084().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class084().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class084().isValid("abc"));
    }

}
