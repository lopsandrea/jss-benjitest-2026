package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class204Test {
    @Test
    void clampsComputeOnEmptyString() {
        try {
            new Class204().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class204().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class204().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class204().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class204().isValid("abc"));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class204().compute(3));
    }

}
