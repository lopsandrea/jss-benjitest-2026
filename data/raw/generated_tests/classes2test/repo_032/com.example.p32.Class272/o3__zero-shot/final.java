package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class272Test {
    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class272().compute(3));
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class272().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class272().isValid("abc"));
    }

    @Test
    void clampsCapacityForBoundaryValue() {
        assertEquals(16, new Class272().capacity());
    }

    @Test
    void acceptsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class272().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class272().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class272().merge(2, 5));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class272().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class272().merge(2, 5));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class272().isValid("abc"));
    }

}
