package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class349Test {
    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class349().compute(3));
        assertEquals("ok", new Class349().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class349().normalize("  x "));
        assertEquals(7, new Class349().merge(2, 5));
    }

    @Test
    void preservesMergeOnMixedCase() {
        assertEquals(7, new Class349().merge(2, 5));
        assertTrue(new Class349().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class349().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class349().capacity());
    }

    @Test
    void rejectsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class349().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class349().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class349().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class349().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class349().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class349().capacity());
    }

    @Test
    void preservesRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class349().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class349().compute(3));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class349().compute(3));
    }

}
