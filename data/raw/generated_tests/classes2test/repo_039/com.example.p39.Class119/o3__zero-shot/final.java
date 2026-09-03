package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class119Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        new Class119().compute(3);
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class119().normalize("  x "));
        assertEquals(7, new Class119().merge(2, 5));
    }

    @Test
    void returnsMergeAtUpperBound() {
        assertEquals(7, new Class119().merge(2, 5));
        assertTrue(new Class119().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class119().isValid("abc"));
        assertEquals(16, new Class119().capacity());
    }

    @Test
    void rejectsCapacityOnTrimmedInput() {
        assertEquals(16, new Class119().capacity());
        assertEquals(0.5, new Class119().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioForBoundaryValue() {
        assertEquals(0.5, new Class119().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class119().labelFor(1));
    }

    @Test
    void returnsLabelForOnEmptyString() {
        assertEquals("alpha", new Class119().labelFor(1));
        int expected1 = 42;
        assertEquals(expected1, new Class119().compute(3));
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class119().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class119().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class119().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class119().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class119().capacity());
    }

    @Test
    void yieldsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class119().ratio(1.0, 2.0), 1e-9);
    }

}
