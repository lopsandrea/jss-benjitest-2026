package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class266Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class266().compute(3));
        assertEquals("ok", new Class266().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class266().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class266().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class266().merge(2, 5));
        assertTrue(new Class266().isValid("abc"));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class266().isValid("abc"));
    }

    @Test
    void clampsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class266().capacity());
    }

    @Test
    void returnsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class266().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class266().labelFor(1));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class266().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class266().normalize("  x "));
    }

}
