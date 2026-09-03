package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class202Test {
    @Test
    void yieldsComputeAtZero() {
        assertEquals(42, new Class202().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class202().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class202().merge(2, 5));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class202().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class202().capacity());
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class202().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class202().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class202().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class202().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class202().capacity());
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class202().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class202().normalize("  x "));
    }

}
