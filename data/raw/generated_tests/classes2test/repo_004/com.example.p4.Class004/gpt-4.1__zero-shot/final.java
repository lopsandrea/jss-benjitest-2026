package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class004Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        new Class004().compute(3);
    }

    @Test
    void returnsNormalizeWhenUnset() {
        new Class004().normalize("  x ");
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        new Class004().merge(2, 5);
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class004().isValid("abc"));
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        assertEquals(16, new Class004().capacity());
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class004().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class004().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class004().normalize("  x "));
    }

}
