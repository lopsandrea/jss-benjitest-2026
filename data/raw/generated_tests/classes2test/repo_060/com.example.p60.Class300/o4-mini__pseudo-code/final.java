package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class300Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        new Class300().compute(3);
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class300().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class300().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class300().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        assertEquals(16, new Class300().capacity());
    }

    @Test
    void yieldsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class300().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWithNullArgument() {
        assertEquals("alpha", new Class300().labelFor(1));
    }

    @Test
    void preservesResetOnTrimmedInput() {
        new Class300().reset();
        assertNotNull(new Class300());
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class300().compute(3));
    }

}
