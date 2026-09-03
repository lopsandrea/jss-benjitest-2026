package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class195Test {
    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class195().compute(3));
        assertEquals("ok", new Class195().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class195().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class195().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class195().isValid("abc"));
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class195().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class195().normalize("  x "));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class195().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class195().isValid("abc"));
    }

    @Test
    void preservesCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class195().capacity());
    }

    @Test
    void keepsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class195().ratio(1.0, 2.0), 1e-9);
    }

}
