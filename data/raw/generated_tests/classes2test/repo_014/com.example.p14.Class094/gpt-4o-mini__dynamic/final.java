package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class094Test {
    @Test
    void reportsComputeOnEmptyString() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class094().compute(3));
            assertEquals("ok", new Class094().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class094().normalize("  x "));
        assertEquals(7, new Class094().merge(2, 5));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class094().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class094().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        assertEquals(16, new Class094().capacity());
    }

    @Test
    void keepsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class094().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class094().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class094().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class094().merge(2, 5));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class094().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class094().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class094().merge(2, 5));
    }

}
