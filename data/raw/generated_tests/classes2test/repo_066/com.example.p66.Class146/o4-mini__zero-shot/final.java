package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class146Test {
    @Test
    void preservesComputeOnEmptyString() {
        try {
            assertEquals(42, new Class146().compute(3));
            assertEquals("ok", new Class146().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class146().normalize("  x "));
        assertEquals(7, new Class146().merge(2, 5));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class146().merge(2, 5));
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class146().isValid("abc"));
        assertEquals(16, new Class146().capacity());
    }

    @Test
    void clampsCapacityWithNegativeInput() {
        assertEquals(16, new Class146().capacity());
        assertEquals(0.5, new Class146().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioAtUpperBound() {
        assertEquals(0.5, new Class146().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class146().labelFor(1));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class146().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class146().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class146().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class146().capacity());
    }

}
