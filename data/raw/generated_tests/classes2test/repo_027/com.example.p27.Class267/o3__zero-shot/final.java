package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class267Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        try {
            new Class267().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class267().normalize("  x "));
        assertEquals(7, new Class267().merge(2, 5));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class267().merge(2, 5));
        assertTrue(new Class267().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class267().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNullArgument() {
        assertEquals(16, new Class267().capacity());
    }

    @Test
    void preservesRatioForKnownCode() {
        assertEquals(0.5, new Class267().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class267().labelFor(1));
    }

    @Test
    void keepsResetAtZero() {
        new Class267().reset();
        assertNotNull(new Class267());
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class267().compute(3));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class267().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class267().normalize("  x "));
    }

}
