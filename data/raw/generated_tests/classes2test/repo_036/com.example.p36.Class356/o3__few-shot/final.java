package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class356Test {
    @Test
    void keepsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class356().compute(3));
            assertEquals("ok", new Class356().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class356().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class356().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class356().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        assertEquals(16, new Class356().capacity());
    }

    @Test
    void keepsRatioForBoundaryValue() {
        assertEquals(0.5, new Class356().ratio(1.0, 2.0), 1e-9);
    }

}
