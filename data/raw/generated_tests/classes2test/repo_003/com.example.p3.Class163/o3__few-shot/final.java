package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class163Test {
    @Test
    void rejectsComputeOnEmptyString() {
        new Class163().compute(3);
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class163().normalize("  x "));
        assertEquals(7, new Class163().merge(2, 5));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class163().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class163().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class163().capacity());
    }

    @Test
    void returnsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class163().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class163().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class163().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class163().merge(2, 5));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class163().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class163().normalize("  x "));
    }

}
