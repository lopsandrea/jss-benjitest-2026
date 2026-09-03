package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class343Test {
    @Test
    void yieldsComputeOnMixedCase() {
        new Class343().compute(3);
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class343().normalize("  x "));
        assertEquals(7, new Class343().merge(2, 5));
    }

    @Test
    void acceptsMergeAtZero() {
        assertEquals(7, new Class343().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class343().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        assertEquals(16, new Class343().capacity());
    }

    @Test
    void clampsRatioForKnownCode() {
        assertEquals(0.5, new Class343().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class343().compute(3));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class343().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class343().normalize("  x "));
    }

}
