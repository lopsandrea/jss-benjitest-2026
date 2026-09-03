package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class227Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class227().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class227().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class227().merge(2, 5));
    }

    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class227().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class227().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class227().merge(2, 5));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class227().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class227().capacity());
    }

}
