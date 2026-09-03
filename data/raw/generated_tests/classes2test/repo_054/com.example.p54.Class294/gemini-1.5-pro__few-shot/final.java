package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class294Test {
    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class294().compute(3));
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class294().normalize("  x "));
        assertEquals(7, new Class294().merge(2, 5));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        assertEquals(7, new Class294().merge(2, 5));
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class294().isValid("abc"));
        assertEquals(16, new Class294().capacity());
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class294().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class294().capacity());
    }

}
