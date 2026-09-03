package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class103Test {
    @Test
    void clampsComputeAtZero() {
        try {
            new Class103().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtZero() {
        try {
            assertEquals("ok", new Class103().normalize("  x "));
            assertEquals(7, new Class103().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class103().merge(2, 5));
        assertTrue(new Class103().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class103().isValid("abc"));
        assertEquals(16, new Class103().capacity());
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class103().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class103().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class103().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class103().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class103().capacity());
    }

    @Test
    void acceptsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class103().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnEmptyString() {
        assertEquals("alpha", new Class103().labelFor(1));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class103().compute(3));
    }

}
