package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class355Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class355().compute(3));
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class355().normalize("  x "));
        assertEquals(7, new Class355().merge(2, 5));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class355().merge(2, 5));
        assertTrue(new Class355().isValid("abc"));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class355().isValid("abc"));
        assertEquals(42, new Class355().compute(3));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class355().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class355().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class355().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class355().isValid("abc"));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class355().compute(3));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class355().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class355().isValid("abc"));
    }

}
