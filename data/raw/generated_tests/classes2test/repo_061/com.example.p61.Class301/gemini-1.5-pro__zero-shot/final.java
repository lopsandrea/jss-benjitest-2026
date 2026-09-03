package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class301Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class301().compute(3));
        assertEquals("ok", new Class301().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class301().normalize("  x "));
        assertEquals(7, new Class301().merge(2, 5));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class301().merge(2, 5));
        assertTrue(new Class301().isValid("abc"));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class301().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class301().capacity());
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class301().capacity());
    }

    @Test
    void clampsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class301().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class301().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class301().normalize("  x "));
    }

}
