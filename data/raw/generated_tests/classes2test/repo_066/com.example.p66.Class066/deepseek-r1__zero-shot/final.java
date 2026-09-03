package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class066Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        new Class066().compute(3);
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class066().normalize("  x "));
        assertEquals(7, new Class066().merge(2, 5));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        assertEquals(7, new Class066().merge(2, 5));
        assertTrue(new Class066().isValid("abc"));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class066().isValid("abc"));
        assertEquals(16, new Class066().capacity());
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        assertEquals(16, new Class066().capacity());
        assertEquals(42, new Class066().compute(3));
    }

    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class066().compute(3));
        assertEquals("ok", new Class066().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class066().normalize("  x "));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class066().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class066().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class066().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class066().isValid("abc"));
    }

    @Test
    void acceptsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class066().capacity());
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class066().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class066().normalize("  x "));
    }

}
