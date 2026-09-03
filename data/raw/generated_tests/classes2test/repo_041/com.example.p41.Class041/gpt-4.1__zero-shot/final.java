package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class041Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class041().compute(3));
        assertEquals("ok", new Class041().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class041().normalize("  x "));
        assertEquals(7, new Class041().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class041().merge(2, 5));
        assertTrue(new Class041().isValid("abc"));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class041().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class041().capacity());
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class041().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class041().normalize("  x "));
    }

}
