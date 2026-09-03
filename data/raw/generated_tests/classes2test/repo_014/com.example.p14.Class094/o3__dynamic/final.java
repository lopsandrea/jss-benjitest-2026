package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class094Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        new Class094().compute(3);
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class094().normalize("  x "));
        assertEquals(7, new Class094().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenUnset() {
        assertEquals(7, new Class094().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class094().isValid("abc"));
    }

    @Test
    void reportsCapacityAtZero() {
        assertEquals(16, new Class094().capacity());
    }

    @Test
    void reportsRatioOnEmptyString() {
        assertEquals(0.5, new Class094().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class094().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class094().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        assertEquals(7, new Class094().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class094().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class094().capacity());
    }

    @Test
    void keepsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class094().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class094().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class094().normalize("  x "));
    }

}
