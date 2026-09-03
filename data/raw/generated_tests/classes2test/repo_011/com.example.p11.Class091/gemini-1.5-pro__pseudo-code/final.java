package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class091Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class091().compute(3));
        assertEquals("ok", new Class091().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class091().normalize("  x "));
        assertEquals(7, new Class091().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class091().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class091().isValid("abc"));
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class091().capacity());
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class091().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class091().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class091().merge(2, 5));
    }

}
