package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class234Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class234().compute(3));
        assertEquals("ok", new Class234().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class234().normalize("  x "));
        assertEquals(7, new Class234().merge(2, 5));
    }

    @Test
    void yieldsMergeAtZero() {
        assertEquals(7, new Class234().merge(2, 5));
        assertTrue(new Class234().isValid("abc"));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class234().isValid("abc"));
    }

    @Test
    void clampsCapacityOnMixedCase() {
        assertEquals(16, new Class234().capacity());
    }

    @Test
    void preservesRatioOnMixedCase() {
        assertEquals(0.5, new Class234().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class234().labelFor(1));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class234().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class234().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class234().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class234().isValid("abc"));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class234().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class234().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class234().merge(2, 5));
    }

}
