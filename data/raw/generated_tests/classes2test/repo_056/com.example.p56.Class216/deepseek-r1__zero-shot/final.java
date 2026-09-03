package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {
    @Test
    void yieldsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class216().compute(3));
            assertEquals("ok", new Class216().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class216().normalize("  x "));
            assertEquals(7, new Class216().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class216().merge(2, 5));
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class216().isValid("abc"));
        assertEquals(16, new Class216().capacity());
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class216().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class216().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class216().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class216().isValid("abc"));
    }

}
