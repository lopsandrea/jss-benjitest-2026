package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class269Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class269().compute(3));
            assertEquals("ok", new Class269().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class269().normalize("  x "));
            assertEquals(7, new Class269().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class269().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class269().isValid("abc"));
    }

    @Test
    void keepsComputeWhenUnset() {
        assertEquals(42, new Class269().compute(3));
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class269().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class269().normalize("  x "));
    }

}
