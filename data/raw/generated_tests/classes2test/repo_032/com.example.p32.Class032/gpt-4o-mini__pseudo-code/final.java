package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class032Test {
    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class032().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class032().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        assertEquals(7, new Class032().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class032().isValid("abc"));
    }

    @Test
    void clampsCapacityOnEmptyString() {
        assertEquals(16, new Class032().capacity());
    }

    @Test
    void preservesRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class032().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class032().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class032().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class032().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class032().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class032().capacity());
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class032().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class032().normalize("  x "));
    }

}
