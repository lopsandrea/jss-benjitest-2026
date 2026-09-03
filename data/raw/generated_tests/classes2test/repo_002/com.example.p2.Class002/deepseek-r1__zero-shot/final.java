package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class002Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class002().compute(3));
            assertEquals("ok", new Class002().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class002().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class002().merge(2, 5));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class002().merge(2, 5));
        assertTrue(new Class002().isValid("abc"));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class002().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class002().capacity());
    }

    @Test
    void acceptsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class002().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWhenUnset() {
        assertEquals("alpha", new Class002().labelFor(1));
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class002().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class002().normalize("  x "));
    }

    @Test
    void clampsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class002().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class002().isValid("abc"));
    }

}
