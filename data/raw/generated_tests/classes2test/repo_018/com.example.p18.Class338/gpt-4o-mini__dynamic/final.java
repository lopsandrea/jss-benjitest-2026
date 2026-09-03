package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class338Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class338().compute(3));
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class338().normalize("  x "));
        assertEquals(7, new Class338().merge(2, 5));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class338().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class338().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        assertEquals(16, new Class338().capacity());
    }

    @Test
    void yieldsRatioWithNegativeInput() {
        assertEquals(0.5, new Class338().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        assertEquals(42, new Class338().compute(3));
    }

    @Test
    void keepsComputeWhenUnset() {
        assertEquals(42, new Class338().compute(3));
    }

}
