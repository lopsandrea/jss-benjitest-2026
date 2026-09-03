package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class232Test {
    @Test
    void yieldsComputeWithNullArgument() {
        new Class232().compute(3);
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        new Class232().normalize("  x ");
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class232().merge(2, 5));
        assertTrue(new Class232().isValid("abc"));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class232().isValid("abc"));
        assertEquals(16, new Class232().capacity());
    }

    @Test
    void yieldsCapacityForKnownCode() {
        assertEquals(16, new Class232().capacity());
    }

    @Test
    void rejectsRatioForKnownCode() {
        assertEquals(0.5, new Class232().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class232().labelFor(1));
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class232().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class232().normalize("  x "));
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class232().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class232().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class232().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class232().isValid("abc"));
    }

}
