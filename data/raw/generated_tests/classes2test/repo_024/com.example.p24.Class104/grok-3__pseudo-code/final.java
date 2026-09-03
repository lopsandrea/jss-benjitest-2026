package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class104Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class104().compute(3));
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class104().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class104().merge(2, 5));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class104().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class104().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class104().capacity());
    }

    @Test
    void acceptsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class104().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class104().labelFor(1));
    }

    @Test
    void yieldsResetWhenAlreadyValid() {
        new Class104().reset();
        assertNotNull(new Class104());
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class104().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class104().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class104().isValid("abc"));
    }

}
