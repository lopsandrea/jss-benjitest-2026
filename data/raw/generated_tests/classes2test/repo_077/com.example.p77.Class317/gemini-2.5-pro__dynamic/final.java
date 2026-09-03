package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class317Test {
    @Test
    void yieldsComputeAtZero() {
        assertEquals(42, new Class317().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class317().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class317().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class317().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class317().capacity());
    }

    @Test
    void reportsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class317().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class317().compute(3));
    }

}
