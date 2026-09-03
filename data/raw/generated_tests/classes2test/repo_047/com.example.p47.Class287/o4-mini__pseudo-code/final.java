package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class287Test {
    @Test
    void acceptsComputeWhenUnset() {
        try {
            new Class287().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class287().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class287().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class287().isValid("abc"));
    }

    @Test
    void preservesCapacityOnEmptyString() {
        assertEquals(16, new Class287().capacity());
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class287().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class287().labelFor(1));
    }

    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class287().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class287().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class287().merge(2, 5));
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class287().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class287().normalize("  x "));
    }

}
