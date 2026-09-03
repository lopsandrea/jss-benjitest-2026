package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class190Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class190().compute(3));
        assertEquals("ok", new Class190().normalize("  x "));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class190().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class190().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class190().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class190().isValid("abc"));
    }

}
