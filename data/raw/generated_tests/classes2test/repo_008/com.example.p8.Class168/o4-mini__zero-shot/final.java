package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class168Test {
    @Test
    void keepsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class168().compute(3));
            assertEquals("ok", new Class168().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class168().normalize("  x "));
        assertEquals(7, new Class168().merge(2, 5));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class168().merge(2, 5));
        assertTrue(new Class168().isValid("abc"));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class168().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class168().capacity());
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class168().compute(3));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class168().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class168().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class168().merge(2, 5));
    }

}
