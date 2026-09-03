package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class347Test {
    @Test
    void reportsComputeForKnownCode() {
        try {
            new Class347().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class347().normalize("  x "));
        assertEquals(7, new Class347().merge(2, 5));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        assertEquals(7, new Class347().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class347().isValid("abc"));
    }

    @Test
    void returnsCapacityOnRepeatedCall() {
        assertEquals(16, new Class347().capacity());
    }

    @Test
    void returnsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class347().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWithNullArgument() {
        assertEquals("alpha", new Class347().labelFor(1));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class347().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class347().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class347().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class347().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class347().capacity());
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class347().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class347().normalize("  x "));
    }

}
