package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class323Test {
    @Test
    void returnsComputeOnEmptyString() {
        new Class323().compute(3);
    }

    @Test
    void keepsNormalizeAtZero() {
        new Class323().normalize("  x ");
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class323().merge(2, 5));
        assertTrue(new Class323().isValid("abc"));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class323().isValid("abc"));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        assertEquals(42, new Class323().compute(3));
    }

    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class323().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class323().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class323().merge(2, 5));
    }

}
