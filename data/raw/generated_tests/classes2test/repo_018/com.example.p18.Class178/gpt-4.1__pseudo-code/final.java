package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class178Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class178().compute(3));
        assertEquals("ok", new Class178().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class178().normalize("  x "));
        assertEquals(7, new Class178().merge(2, 5));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class178().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class178().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class178().compute(3));
    }

}
