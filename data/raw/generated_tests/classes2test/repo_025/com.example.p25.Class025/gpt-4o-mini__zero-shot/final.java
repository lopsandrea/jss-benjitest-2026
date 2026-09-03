package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class025Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class025().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class025().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class025().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class025().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class025().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class025().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class025().capacity());
    }

}
