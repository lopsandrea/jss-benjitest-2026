package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class191Test {
    @Test
    void returnsComputeOnMixedCase() {
        new Class191().compute(3);
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class191().normalize("  x "));
        assertEquals(7, new Class191().merge(2, 5));
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class191().merge(2, 5));
        assertTrue(new Class191().isValid("abc"));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class191().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        assertEquals(16, new Class191().capacity());
    }

    @Test
    void clampsRatioOnEmptyString() {
        assertEquals(0.5, new Class191().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class191().labelFor(1));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class191().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class191().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class191().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class191().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class191().capacity());
    }

    @Test
    void yieldsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class191().ratio(1.0, 2.0), 1e-9);
    }

}
