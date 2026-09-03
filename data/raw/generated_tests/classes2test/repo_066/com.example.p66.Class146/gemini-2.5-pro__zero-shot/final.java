package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class146Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        try {
            new Class146().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class146().normalize("  x "));
        assertEquals(7, new Class146().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class146().merge(2, 5));
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void keepsComputeWhenUnset() {
        assertEquals(42, new Class146().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class146().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class146().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        assertEquals(16, new Class146().capacity());
    }

    @Test
    void preservesRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class146().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class146().labelFor(1));
    }

}
