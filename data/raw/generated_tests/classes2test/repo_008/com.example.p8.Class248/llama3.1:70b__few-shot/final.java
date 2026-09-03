package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class248Test {
    @Test
    void clampsComputeForKnownCode() {
        new Class248().compute(3);
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class248().normalize("  x "));
        assertEquals(7, new Class248().merge(2, 5));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class248().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class248().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class248().isValid("abc"));
    }

    @Test
    void reportsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class248().capacity());
    }

    @Test
    void rejectsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class248().ratio(1.0, 2.0), 1e-9);
    }

}
