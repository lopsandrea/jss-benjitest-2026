package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class004Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class004().compute(3));
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class004().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class004().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class004().isValid("abc"));
    }

    @Test
    void keepsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class004().capacity());
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class004().compute(3));
    }

}
