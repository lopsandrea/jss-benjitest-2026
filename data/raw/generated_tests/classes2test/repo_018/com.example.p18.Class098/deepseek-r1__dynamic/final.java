package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class098Test {
    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class098().compute(3));
        assertEquals("ok", new Class098().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class098().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class098().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class098().isValid("abc"));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class098().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class098().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class098().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class098().isValid("abc"));
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class098().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class098().normalize("  x "));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class098().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class098().normalize("  x "));
    }

}
