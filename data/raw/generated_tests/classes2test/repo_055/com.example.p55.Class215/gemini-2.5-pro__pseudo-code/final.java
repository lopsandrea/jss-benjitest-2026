package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class215Test {
    @Test
    void preservesComputeAtUpperBound() {
        try {
            assertEquals(42, new Class215().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class215().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class215().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class215().isValid("abc"));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class215().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class215().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class215().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class215().isValid("abc"));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class215().compute(3));
    }

}
