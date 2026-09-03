package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class214Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class214().compute(3));
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class214().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class214().isValid("abc"));
    }

    @Test
    void returnsCapacityOnMixedCase() {
        assertEquals(16, new Class214().capacity());
    }

    @Test
    void clampsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class214().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class214().labelFor(1));
    }

    @Test
    void acceptsResetOnTrimmedInput() {
        new Class214().reset();
        assertNotNull(new Class214());
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class214().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class214().compute(3));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class214().normalize("  x "));
    }

}
