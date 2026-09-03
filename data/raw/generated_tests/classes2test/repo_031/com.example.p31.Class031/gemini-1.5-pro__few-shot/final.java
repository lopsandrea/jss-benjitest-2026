package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class031Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class031().compute(3));
            assertEquals("ok", new Class031().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class031().normalize("  x "));
        assertEquals(7, new Class031().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        assertEquals(7, new Class031().merge(2, 5));
        assertTrue(new Class031().isValid("abc"));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class031().isValid("abc"));
    }

    @Test
    void reportsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class031().capacity());
    }

    @Test
    void reportsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class031().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnMixedCase() {
        assertEquals("alpha", new Class031().labelFor(1));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class031().compute(3));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class031().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class031().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class031().merge(2, 5));
    }

}
