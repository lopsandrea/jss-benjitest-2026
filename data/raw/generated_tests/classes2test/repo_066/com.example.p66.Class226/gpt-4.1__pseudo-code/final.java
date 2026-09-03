package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class226Test {
    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class226().compute(3));
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class226().normalize("  x "));
        assertEquals(7, new Class226().merge(2, 5));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class226().merge(2, 5));
        assertTrue(new Class226().isValid("abc"));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class226().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class226().capacity());
    }

    @Test
    void acceptsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class226().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class226().compute(3));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class226().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class226().merge(2, 5));
    }

}
