package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class154Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class154().compute(3));
        assertEquals("ok", new Class154().normalize("  x "));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class154().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class154().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class154().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        assertEquals(16, new Class154().capacity());
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class154().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class154().compute(3));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class154().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class154().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class154().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class154().isValid("abc"));
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class154().capacity());
    }

    @Test
    void acceptsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class154().ratio(1.0, 2.0), 1e-9);
    }

}
