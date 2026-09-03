package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class139Test {
    @Test
    void rejectsComputeWhenAlreadyValid() {
        assertEquals(42, new Class139().compute(3));
        assertEquals("ok", new Class139().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class139().normalize("  x "));
        assertEquals(7, new Class139().merge(2, 5));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        assertEquals(7, new Class139().merge(2, 5));
        assertTrue(new Class139().isValid("abc"));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class139().isValid("abc"));
    }

    @Test
    void reportsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class139().capacity());
    }

    @Test
    void acceptsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class139().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForAtZero() {
        assertEquals("alpha", new Class139().labelFor(1));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class139().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class139().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class139().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class139().isValid("abc"));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class139().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class139().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class139().merge(2, 5));
    }

}
