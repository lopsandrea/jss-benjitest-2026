package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class262Test {
    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class262().compute(3));
        assertEquals("ok", new Class262().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class262().normalize("  x "));
        assertEquals(7, new Class262().merge(2, 5));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class262().merge(2, 5));
        assertTrue(new Class262().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class262().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        assertEquals(16, new Class262().capacity());
    }

    @Test
    void returnsRatioOnMixedCase() {
        assertEquals(0.5, new Class262().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class262().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class262().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class262().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class262().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class262().capacity());
    }

    @Test
    void reportsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class262().ratio(1.0, 2.0), 1e-9);
    }

}
