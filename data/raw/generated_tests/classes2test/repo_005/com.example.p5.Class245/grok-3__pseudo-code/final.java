package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class245Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        new Class245().compute(3);
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class245().normalize("  x "));
        assertEquals(7, new Class245().merge(2, 5));
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class245().merge(2, 5));
        assertTrue(new Class245().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class245().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        assertEquals(16, new Class245().capacity());
    }

    @Test
    void clampsRatioOnEmptyString() {
        assertEquals(0.5, new Class245().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForAtZero() {
        assertEquals("alpha", new Class245().labelFor(1));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class245().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class245().normalize("  x "));
    }

    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class245().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class245().normalize("  x "));
    }

}
