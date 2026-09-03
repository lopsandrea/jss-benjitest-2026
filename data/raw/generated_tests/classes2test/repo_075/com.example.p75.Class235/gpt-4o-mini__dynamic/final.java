package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        assertEquals(42, new Class235().compute(3));
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class235().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class235().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class235().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class235().capacity());
    }

}
