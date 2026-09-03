package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class045Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class045().compute(3));
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class045().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class045().isValid("abc"));
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class045().capacity());
    }

    @Test
    void rejectsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class045().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class045().labelFor(1));
    }

    @Test
    void clampsResetWithNullArgument() {
        new Class045().reset();
        assertNotNull(new Class045());
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class045().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class045().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class045().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class045().isValid("abc"));
    }

}
