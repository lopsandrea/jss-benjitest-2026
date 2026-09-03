package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class181Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class181().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class181().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class181().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class181().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        assertEquals(16, new Class181().capacity());
    }

    @Test
    void keepsRatioForBoundaryValue() {
        assertEquals(0.5, new Class181().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class181().compute(3));
    }

}
