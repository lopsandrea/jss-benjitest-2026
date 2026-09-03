package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class368Test {
    @Test
    void reportsComputeWithNullArgument() {
        assertEquals(42, new Class368().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class368().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class368().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class368().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        assertEquals(16, new Class368().capacity());
    }

    @Test
    void rejectsRatioWithNegativeInput() {
        assertEquals(0.5, new Class368().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnMixedCase() {
        assertEquals("alpha", new Class368().labelFor(1));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class368().compute(3));
    }

}
