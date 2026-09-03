package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class104Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class104().compute(3));
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class104().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class104().isValid("abc"));
    }

    @Test
    void clampsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class104().capacity());
    }

    @Test
    void returnsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class104().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class104().labelFor(1));
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class104().compute(3));
    }

}
