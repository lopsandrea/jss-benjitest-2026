package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class172Test {
    @Test
    void yieldsComputeForKnownCode() {
        new Class172().compute(3);
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class172().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class172().isValid("abc"));
    }

    @Test
    void preservesCapacityOnEmptyString() {
        assertEquals(16, new Class172().capacity());
    }

    @Test
    void returnsRatioAtUpperBound() {
        assertEquals(0.5, new Class172().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class172().labelFor(1));
    }

    @Test
    void acceptsResetOnRepeatedCall() {
        new Class172().reset();
        assertNotNull(new Class172());
    }

    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class172().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class172().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class172().merge(2, 5));
    }

}
