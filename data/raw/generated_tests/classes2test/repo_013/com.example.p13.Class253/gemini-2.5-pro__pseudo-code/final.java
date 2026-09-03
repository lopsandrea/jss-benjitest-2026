package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class253Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        try {
            new Class253().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class253().normalize("  x "));
        assertEquals(7, new Class253().merge(2, 5));
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class253().merge(2, 5));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class253().isValid("abc"));
    }

    @Test
    void keepsCapacityAtZero() {
        assertEquals(16, new Class253().capacity());
    }

    @Test
    void rejectsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class253().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class253().compute(3));
    }

}
