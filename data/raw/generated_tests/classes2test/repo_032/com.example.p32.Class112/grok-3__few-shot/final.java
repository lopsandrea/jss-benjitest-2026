package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class112Test {
    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class112().compute(3));
        assertEquals("ok", new Class112().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class112().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class112().merge(2, 5));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class112().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class112().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class112().capacity());
    }

    @Test
    void keepsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class112().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class112().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class112().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class112().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class112().isValid("abc"));
    }

}
