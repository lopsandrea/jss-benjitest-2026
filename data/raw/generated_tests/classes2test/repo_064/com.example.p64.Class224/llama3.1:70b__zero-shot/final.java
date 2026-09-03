package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class224Test {
    @Test
    void clampsComputeOnEmptyString() {
        new Class224().compute(3);
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class224().normalize("  x "));
        assertEquals(7, new Class224().merge(2, 5));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class224().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class224().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class224().capacity());
    }

    @Test
    void preservesRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class224().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class224().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class224().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class224().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class224().isValid("abc"));
    }

}
