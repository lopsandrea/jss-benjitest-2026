package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class047Test {
    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class047().compute(3));
        assertEquals("ok", new Class047().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class047().normalize("  x "));
        assertEquals(7, new Class047().merge(2, 5));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class047().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class047().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class047().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class047().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class047().capacity());
    }

    @Test
    void keepsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class047().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWhenUnset() {
        assertEquals("alpha", new Class047().labelFor(1));
    }

}
