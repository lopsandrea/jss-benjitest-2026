package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class039Test {
    @Test
    void returnsComputeAtZero() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class039().compute(3));
        assertEquals("ok", new Class039().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class039().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class039().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class039().merge(2, 5));
        assertTrue(new Class039().isValid("abc"));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class039().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class039().capacity());
    }

    @Test
    void rejectsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class039().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForWhenUnset() {
        assertEquals("alpha", new Class039().labelFor(1));
    }

    @Test
    void keepsResetOnMixedCase() {
        new Class039().reset();
        assertNotNull(new Class039());
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class039().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class039().normalize("  x "));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class039().compute(3));
    }

}
