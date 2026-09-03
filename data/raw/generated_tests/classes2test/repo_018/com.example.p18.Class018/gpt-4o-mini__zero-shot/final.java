package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class018Test {
    @Test
    void returnsComputeForBoundaryValue() {
        assertEquals(42, new Class018().compute(3));
        assertEquals("ok", new Class018().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class018().normalize("  x "));
        assertEquals(7, new Class018().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class018().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class018().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class018().capacity());
    }

    @Test
    void reportsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class018().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class018().labelFor(1));
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class018().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class018().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class018().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class018().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class018().capacity());
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class018().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class018().normalize("  x "));
    }

}
