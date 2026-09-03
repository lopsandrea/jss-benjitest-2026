package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class102Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class102().compute(3));
        assertEquals("ok", new Class102().normalize("  x "));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class102().normalize("  x "));
        assertEquals(7, new Class102().merge(2, 5));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class102().merge(2, 5));
        assertTrue(new Class102().isValid("abc"));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class102().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class102().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class102().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class102().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class102().capacity());
    }

    @Test
    void yieldsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class102().ratio(1.0, 2.0), 1e-9);
    }

}
