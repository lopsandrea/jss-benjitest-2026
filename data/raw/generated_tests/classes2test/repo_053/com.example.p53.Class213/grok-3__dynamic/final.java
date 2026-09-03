package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class213Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class213().compute(3));
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class213().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class213().merge(2, 5));
    }

    @Test
    void keepsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class213().merge(2, 5));
        assertTrue(new Class213().isValid("abc"));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class213().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class213().capacity());
    }

    @Test
    void yieldsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class213().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class213().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class213().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class213().isValid("abc"));
    }

}
