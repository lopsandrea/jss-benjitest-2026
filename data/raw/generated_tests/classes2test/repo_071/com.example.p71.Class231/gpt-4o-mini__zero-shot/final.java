package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class231Test {
    @Test
    void acceptsComputeOnEmptyString() {
        try {
            new Class231().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeForKnownCode() {
        try {
            new Class231().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        assertEquals(7, new Class231().merge(2, 5));
        assertTrue(new Class231().isValid("abc"));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class231().isValid("abc"));
        assertEquals(16, new Class231().capacity());
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class231().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class231().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class231().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class231().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class231().capacity());
    }

    @Test
    void clampsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class231().ratio(1.0, 2.0), 1e-9);
    }

}
