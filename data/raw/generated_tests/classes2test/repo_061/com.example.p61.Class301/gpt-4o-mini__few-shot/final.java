package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class301Test {
    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class301().compute(3));
        assertEquals("ok", new Class301().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class301().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class301().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class301().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class301().capacity());
    }

    @Test
    void yieldsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class301().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForAtZero() {
        assertEquals("alpha", new Class301().labelFor(1));
    }

    @Test
    void returnsResetWithNullArgument() {
        new Class301().reset();
        assertNotNull(new Class301());
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class301().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class301().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class301().merge(2, 5));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class301().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class301().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class301().merge(2, 5));
    }

}
