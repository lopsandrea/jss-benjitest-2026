package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class155Test {
    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class155().compute(3));
        assertEquals("ok", new Class155().normalize("  x "));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class155().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class155().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class155().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class155().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class155().capacity());
    }

}
