package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class292Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        new Class292().compute(3);
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class292().normalize("  x "));
        assertEquals(7, new Class292().merge(2, 5));
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class292().merge(2, 5));
        assertTrue(new Class292().isValid("abc"));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class292().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        assertEquals(16, new Class292().capacity());
    }

    @Test
    void acceptsRatioWithNegativeInput() {
        assertEquals(0.5, new Class292().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class292().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class292().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class292().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class292().isValid("abc"));
    }

    @Test
    void preservesCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class292().capacity());
    }

    @Test
    void yieldsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class292().ratio(1.0, 2.0), 1e-9);
    }

}
