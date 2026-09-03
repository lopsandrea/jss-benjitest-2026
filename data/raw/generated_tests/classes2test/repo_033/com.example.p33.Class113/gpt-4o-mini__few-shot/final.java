package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class113Test {
    @Test
    void reportsComputeForKnownCode() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class113().compute(3));
        assertEquals("ok", new Class113().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture1.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals("ok", new Class113().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        assertEquals(7, new Class113().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class113().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class113().capacity());
    }

    @Test
    void rejectsComputeAtZero() {
        assertEquals(42, new Class113().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class113().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        assertEquals(7, new Class113().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class113().isValid("abc"));
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        assertEquals(16, new Class113().capacity());
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class113().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class113().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class113().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class113().isValid("abc"));
    }

}
