package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class169Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        new Class169().compute(3);
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class169().normalize("  x "));
        assertEquals(7, new Class169().merge(2, 5));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class169().merge(2, 5));
        assertTrue(new Class169().isValid("abc"));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class169().isValid("abc"));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        assertEquals(42, new Class169().compute(3));
    }

}
