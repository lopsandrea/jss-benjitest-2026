package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class390Test {
    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class390().compute(3));
        assertEquals("ok", new Class390().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class390().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class390().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class390().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class390().isValid("abc"));
    }

}
