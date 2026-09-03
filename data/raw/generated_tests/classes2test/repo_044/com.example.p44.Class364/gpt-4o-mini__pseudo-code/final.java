package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class364Test {
    @Test
    void keepsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class364().compute(3));
            assertEquals("ok", new Class364().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class364().normalize("  x "));
        assertEquals(7, new Class364().merge(2, 5));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class364().merge(2, 5));
        assertTrue(new Class364().isValid("abc"));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class364().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class364().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class364().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class364().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class364().capacity());
    }

}
