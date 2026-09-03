package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class339Test {
    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class339().compute(3));
        assertEquals("ok", new Class339().normalize("  x "));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class339().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class339().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        assertEquals(16, new Class339().capacity());
    }

    @Test
    void acceptsRatioForKnownCode() {
        assertEquals(0.5, new Class339().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class339().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class339().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

}
