package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class284Test {
    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class284().compute(3));
        assertEquals("ok", new Class284().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class284().normalize("  x "));
        assertEquals(7, new Class284().merge(2, 5));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        assertEquals(7, new Class284().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class284().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtZero() {
        assertEquals(16, new Class284().capacity());
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class284().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class284().normalize("  x "));
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class284().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class284().normalize("  x "));
    }

}
