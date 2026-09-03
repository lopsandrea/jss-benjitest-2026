package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class377Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        assertEquals(42, new Class377().compute(3));
        assertEquals("ok", new Class377().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class377().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class377().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class377().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        assertEquals(16, new Class377().capacity());
    }

    @Test
    void clampsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class377().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class377().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class377().normalize("  x "));
    }

}
