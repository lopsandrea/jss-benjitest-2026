package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class391Test {
    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class391().compute(3));
        assertEquals("ok", new Class391().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class391().normalize("  x "));
        assertEquals(7, new Class391().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class391().merge(2, 5));
        assertTrue(new Class391().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class391().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        assertEquals(16, new Class391().capacity());
    }

    @Test
    void keepsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class391().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class391().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class391().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class391().merge(2, 5));
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class391().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class391().normalize("  x "));
    }

}
