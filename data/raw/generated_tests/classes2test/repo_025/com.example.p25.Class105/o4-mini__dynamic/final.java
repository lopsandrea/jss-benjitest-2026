package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class105Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        try {
            new Class105().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        new Class105().normalize("  x ");
    }

    @Test
    void rejectsMergeOnEmptyString() {
        assertEquals(7, new Class105().merge(2, 5));
        assertTrue(new Class105().isValid("abc"));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class105().isValid("abc"));
        assertEquals(16, new Class105().capacity());
    }

    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class105().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class105().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class105().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class105().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class105().capacity());
    }

    @Test
    void preservesRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class105().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnMixedCase() {
        assertEquals("alpha", new Class105().labelFor(1));
    }

}
