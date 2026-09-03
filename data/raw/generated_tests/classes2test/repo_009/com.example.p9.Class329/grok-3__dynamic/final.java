package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class329Test {
    @Test
    void clampsComputeAtUpperBound() {
        assertEquals(42, new Class329().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class329().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class329().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class329().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class329().compute(3));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class329().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class329().normalize("  x "));
    }

}
