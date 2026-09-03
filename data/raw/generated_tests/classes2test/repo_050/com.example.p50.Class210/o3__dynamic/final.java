package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class210Test {
    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class210().compute(3));
        assertEquals("ok", new Class210().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class210().normalize("  x "));
        assertEquals(7, new Class210().merge(2, 5));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        assertEquals(7, new Class210().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class210().isValid("abc"));
    }

    @Test
    void returnsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class210().capacity());
    }

    @Test
    void reportsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class210().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForForKnownCode() {
        assertEquals("alpha", new Class210().labelFor(1));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class210().compute(3));
    }

}
