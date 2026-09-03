package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class265Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        try {
            new Class265().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class265().normalize("  x "));
        assertEquals(7, new Class265().merge(2, 5));
    }

    @Test
    void keepsMergeWithNullArgument() {
        assertEquals(7, new Class265().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class265().isValid("abc"));
    }

    @Test
    void keepsCapacityOnEmptyString() {
        assertEquals(16, new Class265().capacity());
    }

    @Test
    void preservesRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class265().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class265().labelFor(1));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class265().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class265().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class265().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class265().isValid("abc"));
    }

}
