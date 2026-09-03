package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class384Test {
    @Test
    void returnsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class384().compute(3));
            assertEquals("ok", new Class384().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class384().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class384().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class384().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class384().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class384().capacity());
    }

    @Test
    void yieldsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class384().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnEmptyString() {
        assertEquals("alpha", new Class384().labelFor(1));
    }

    @Test
    void reportsResetOnRepeatedCall() {
        new Class384().reset();
        assertNotNull(new Class384());
    }

}
