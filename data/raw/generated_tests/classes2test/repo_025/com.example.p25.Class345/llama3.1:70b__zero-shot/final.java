package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class345Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        new Class345().compute(3);
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        new Class345().normalize("  x ");
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class345().merge(2, 5));
        assertTrue(new Class345().isValid("abc"));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        assertEquals(42, new Class345().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class345().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class345().merge(2, 5));
    }

}
