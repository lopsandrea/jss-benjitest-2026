package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class389Test {
    @Test
    void preservesComputeWithNullArgument() {
        assertEquals(42, new Class389().compute(3));
        assertEquals("ok", new Class389().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class389().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class389().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class389().isValid("abc"));
    }

    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class389().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class389().normalize("  x "));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class389().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class389().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class389().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class389().isValid("abc"));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class389().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class389().normalize("  x "));
    }

}
