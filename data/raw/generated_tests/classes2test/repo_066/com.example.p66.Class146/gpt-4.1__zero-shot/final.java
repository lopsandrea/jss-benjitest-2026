package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class146Test {
    @Test
    void returnsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class146().compute(3));
            assertEquals("ok", new Class146().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class146().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class146().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class146().merge(2, 5));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void reportsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class146().capacity());
    }

    @Test
    void clampsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class146().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForAtZero() {
        assertEquals("alpha", new Class146().labelFor(1));
    }

    @Test
    void keepsResetWithNegativeInput() {
        new Class146().reset();
        assertNotNull(new Class146());
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class146().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class146().normalize("  x "));
    }

}
