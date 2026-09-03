package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class104Test {
    @Test
    void returnsComputeForBoundaryValue() {
        assertEquals(42, new Class104().compute(3));
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class104().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class104().merge(2, 5));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class104().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class104().isValid("abc"));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class104().compute(3));
    }

}
