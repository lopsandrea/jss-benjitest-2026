package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {
    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class216().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class216().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void clampsCapacityForBoundaryValue() {
        assertEquals(16, new Class216().capacity());
    }

    @Test
    void keepsRatioAtUpperBound() {
        assertEquals(0.5, new Class216().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForForKnownCode() {
        assertEquals("alpha", new Class216().labelFor(1));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class216().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class216().capacity());
    }

}
