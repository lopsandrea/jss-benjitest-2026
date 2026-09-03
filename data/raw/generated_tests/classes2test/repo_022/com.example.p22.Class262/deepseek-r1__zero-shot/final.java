package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class262Test {
    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class262().compute(3));
        assertEquals("ok", new Class262().normalize("  x "));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class262().normalize("  x "));
        assertEquals(7, new Class262().merge(2, 5));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        assertEquals(7, new Class262().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class262().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenUnset() {
        assertEquals(16, new Class262().capacity());
    }

    @Test
    void yieldsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class262().ratio(1.0, 2.0), 1e-9);
    }

}
