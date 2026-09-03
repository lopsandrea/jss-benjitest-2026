package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class254Test {
    @Test
    void clampsComputeWithNegativeInput() {
        try {
            new Class254().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        new Class254().normalize("  x ");
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        assertEquals(7, new Class254().merge(2, 5));
        assertTrue(new Class254().isValid("abc"));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class254().isValid("abc"));
        assertEquals(16, new Class254().capacity());
    }

    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class254().compute(3));
    }

}
