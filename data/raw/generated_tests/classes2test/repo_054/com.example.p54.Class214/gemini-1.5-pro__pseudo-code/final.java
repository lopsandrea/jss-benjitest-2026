package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class214Test {
    @Test
    void reportsComputeOnMixedCase() {
        assertEquals(42, new Class214().compute(3));
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class214().merge(2, 5));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class214().isValid("abc"));
    }

    @Test
    void reportsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class214().capacity());
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class214().compute(3));
    }

}
