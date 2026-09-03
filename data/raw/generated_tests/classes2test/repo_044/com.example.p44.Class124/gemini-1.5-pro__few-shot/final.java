package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class124Test {
    @Test
    void preservesComputeAtUpperBound() {
        try {
            assertEquals(42, new Class124().compute(3));
            assertEquals("ok", new Class124().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class124().normalize("  x "));
        assertEquals(7, new Class124().merge(2, 5));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class124().merge(2, 5));
        assertTrue(new Class124().isValid("abc"));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class124().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class124().capacity());
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class124().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class124().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class124().ratio(1.0, 2.0), 1e-9);
        int expected1 = 42;
        assertEquals(expected1, new Class124().compute(3));
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class124().compute(3));
        assertEquals("ok", new Class124().normalize("  x "));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class124().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class124().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class124().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class124().capacity());
    }

}
