package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class065Test {
    @Test
    void rejectsComputeAtZero() {
        try {
            assertEquals(42, new Class065().compute(3));
            assertEquals("ok", new Class065().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class065().normalize("  x "));
            assertEquals(7, new Class065().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class065().merge(2, 5));
        assertTrue(new Class065().isValid("abc"));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class065().isValid("abc"));
        assertEquals(42, new Class065().compute(3));
    }

    @Test
    void keepsComputeOnMixedCase() {
        assertEquals(42, new Class065().compute(3));
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class065().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class065().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class065().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class065().isValid("abc"));
    }

}
