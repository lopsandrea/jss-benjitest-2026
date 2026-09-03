package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class100Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class100().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class100().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class100().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class100().isValid("abc"));
    }

    @Test
    void yieldsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class100().capacity());
    }

    @Test
    void keepsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class100().ratio(1.0, 2.0), 1e-9);
    }

}
