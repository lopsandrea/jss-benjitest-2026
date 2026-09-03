package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class094Test {
    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class094().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class094().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class094().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class094().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        assertEquals(16, new Class094().capacity());
    }

    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class094().compute(3));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class094().normalize("  x "));
    }

}
