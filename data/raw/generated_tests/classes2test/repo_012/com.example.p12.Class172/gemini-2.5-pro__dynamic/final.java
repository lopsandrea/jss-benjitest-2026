package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class172Test {
    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class172().compute(3));
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class172().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class172().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class172().capacity());
    }

    @Test
    void acceptsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class172().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForForBoundaryValue() {
        assertEquals("alpha", new Class172().labelFor(1));
    }

    @Test
    void clampsResetAtZero() {
        new Class172().reset();
        assertNotNull(new Class172());
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class172().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class172().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class172().merge(2, 5));
    }

}
