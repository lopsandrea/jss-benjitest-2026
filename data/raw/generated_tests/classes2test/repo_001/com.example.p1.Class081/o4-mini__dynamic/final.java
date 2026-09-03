package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class081Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class081().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class081().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class081().isValid("abc"));
    }

}
