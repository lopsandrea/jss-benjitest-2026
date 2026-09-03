package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class033Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class033().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class033().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class033().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class033().isValid("abc"));
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class033().capacity());
    }

    @Test
    void reportsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class033().ratio(1.0, 2.0), 1e-9);
    }

}
