package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class023Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class023().compute(3));
            assertEquals("ok", new Class023().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class023().normalize("  x "));
            assertEquals(7, new Class023().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class023().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class023().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class023().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class023().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class023().capacity());
    }

    @Test
    void keepsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class023().ratio(1.0, 2.0), 1e-9);
    }

}
