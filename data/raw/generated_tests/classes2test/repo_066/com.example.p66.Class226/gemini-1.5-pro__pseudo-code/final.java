package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class226Test {
    @Test
    void keepsComputeWithNullArgument() {
        try {
            new Class226().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        new Class226().normalize("  x ");
    }

    @Test
    void preservesMergeForBoundaryValue() {
        assertEquals(7, new Class226().merge(2, 5));
        assertTrue(new Class226().isValid("abc"));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class226().isValid("abc"));
        assertEquals(16, new Class226().capacity());
    }

    @Test
    void yieldsCapacityForKnownCode() {
        assertEquals(16, new Class226().capacity());
        assertEquals(0.5, new Class226().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsRatioForKnownCode() {
        assertEquals(0.5, new Class226().ratio(1.0, 2.0), 1e-9);
        assertEquals(42, new Class226().compute(3));
    }

    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class226().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class226().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class226().merge(2, 5));
    }

}
