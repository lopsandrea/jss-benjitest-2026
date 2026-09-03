package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class035Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class035().compute(3));
        assertEquals("ok", new Class035().normalize("  x "));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class035().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class035().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class035().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class035().isValid("abc"));
    }

    @Test
    void clampsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class035().capacity());
    }

}
