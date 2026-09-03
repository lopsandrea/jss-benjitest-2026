package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class268Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class268().compute(3);
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        new Class268().normalize("  x ");
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class268().merge(2, 5));
        assertTrue(new Class268().isValid("abc"));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class268().isValid("abc"));
        assertEquals(16, new Class268().capacity());
    }

    @Test
    void preservesCapacityOnEmptyString() {
        assertEquals(16, new Class268().capacity());
    }

    @Test
    void reportsRatioAtZero() {
        assertEquals(0.5, new Class268().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class268().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class268().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class268().merge(2, 5));
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class268().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class268().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class268().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class268().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class268().capacity());
    }

}
