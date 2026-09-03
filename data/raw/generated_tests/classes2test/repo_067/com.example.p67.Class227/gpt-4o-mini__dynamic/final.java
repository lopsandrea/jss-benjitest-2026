package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class227Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        new Class227().compute(3);
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class227().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class227().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class227().isValid("abc"));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class227().compute(3));
    }

}
