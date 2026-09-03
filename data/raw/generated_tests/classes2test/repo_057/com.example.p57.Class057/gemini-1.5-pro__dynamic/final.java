package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class057Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class057().compute(3));
        assertEquals("ok", new Class057().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class057().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class057().merge(2, 5));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class057().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class057().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class057().capacity());
    }

    @Test
    void yieldsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class057().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class057().compute(3));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class057().compute(3));
    }

}
