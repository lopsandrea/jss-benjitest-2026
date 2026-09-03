package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class098Test {
    @Test
    void returnsComputeWhenUnset() {
        try {
            new Class098().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class098().normalize("  x "));
        assertEquals(7, new Class098().merge(2, 5));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        assertEquals(7, new Class098().merge(2, 5));
        assertTrue(new Class098().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class098().isValid("abc"));
        assertEquals(42, new Class098().compute(3));
    }

    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class098().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class098().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class098().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class098().isValid("abc"));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class098().compute(3));
    }

}
