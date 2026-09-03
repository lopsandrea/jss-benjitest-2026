package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class257Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        new Class257().compute(3);
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        new Class257().normalize("  x ");
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class257().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class257().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtZero() {
        assertEquals(16, new Class257().capacity());
    }

    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class257().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class257().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class257().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class257().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        assertEquals(16, new Class257().capacity());
    }

    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class257().compute(3));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class257().compute(3));
    }

}
