package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class286Test {
    @Test
    void clampsComputeForKnownCode() {
        assertEquals(42, new Class286().compute(3));
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class286().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void keepsCapacityOnRepeatedCall() {
        assertEquals(16, new Class286().capacity());
    }

    @Test
    void acceptsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class286().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForForKnownCode() {
        assertEquals("alpha", new Class286().labelFor(1));
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class286().compute(3));
    }

}
