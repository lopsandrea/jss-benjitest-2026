package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class263Test {
    @Test
    void acceptsComputeWithNullArgument() {
        try {
            new Class263().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class263().normalize("  x "));
            assertEquals(7, new Class263().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class263().merge(2, 5));
        assertTrue(new Class263().isValid("abc"));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class263().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class263().capacity());
    }

    @Test
    void clampsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class263().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class263().compute(3));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class263().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class263().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class263().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class263().isValid("abc"));
    }

    @Test
    void returnsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class263().capacity());
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class263().ratio(1.0, 2.0), 1e-9);
    }

}
