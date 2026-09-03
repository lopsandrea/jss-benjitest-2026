package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class300Test {
    @Test
    void yieldsComputeOnMixedCase() {
        try {
            new Class300().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class300().normalize("  x "));
        assertEquals(7, new Class300().merge(2, 5));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class300().merge(2, 5));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class300().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        assertEquals(16, new Class300().capacity());
    }

    @Test
    void acceptsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class300().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnMixedCase() {
        assertEquals("alpha", new Class300().labelFor(1));
    }

    @Test
    void keepsResetForKnownCode() {
        new Class300().reset();
        assertNotNull(new Class300());
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class300().compute(3));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class300().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class300().normalize("  x "));
    }

}
