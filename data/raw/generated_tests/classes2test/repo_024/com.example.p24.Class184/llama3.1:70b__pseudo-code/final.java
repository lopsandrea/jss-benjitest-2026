package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class184Test {
    @Test
    void preservesComputeWhenUnset() {
        try {
            assertEquals(42, new Class184().compute(3));
            assertEquals("ok", new Class184().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class184().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class184().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class184().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class184().capacity());
    }

    @Test
    void acceptsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class184().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class184().labelFor(1));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class184().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class184().normalize("  x "));
    }

}
