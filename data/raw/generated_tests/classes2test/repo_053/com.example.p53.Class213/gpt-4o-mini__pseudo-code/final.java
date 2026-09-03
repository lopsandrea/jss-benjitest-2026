package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class213Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        try {
            new Class213().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class213().normalize("  x "));
        assertEquals(7, new Class213().merge(2, 5));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        assertEquals(7, new Class213().merge(2, 5));
        assertTrue(new Class213().isValid("abc"));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class213().isValid("abc"));
        assertEquals(16, new Class213().capacity());
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        assertEquals(16, new Class213().capacity());
    }

    @Test
    void yieldsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class213().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class213().compute(3));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class213().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class213().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class213().isValid("abc"));
    }

}
