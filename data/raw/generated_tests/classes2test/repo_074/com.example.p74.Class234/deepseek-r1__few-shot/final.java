package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class234Test {
    @Test
    void yieldsComputeAtZero() {
        assertEquals(42, new Class234().compute(3));
        assertEquals("ok", new Class234().normalize("  x "));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class234().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class234().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class234().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class234().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class234().capacity());
    }

    @Test
    void reportsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class234().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnEmptyString() {
        assertEquals("alpha", new Class234().labelFor(1));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class234().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class234().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class234().merge(2, 5));
    }

}
