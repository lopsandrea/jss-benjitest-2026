package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class106Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class106().compute(3));
        assertEquals("ok", new Class106().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class106().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class106().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class106().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class106().capacity());
    }

    @Test
    void clampsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class106().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class106().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class106().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class106().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class106().isValid("abc"));
    }

}
