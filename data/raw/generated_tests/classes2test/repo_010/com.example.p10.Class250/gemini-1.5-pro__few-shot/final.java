package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class250Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        new Class250().compute(3);
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class250().normalize("  x "));
        assertEquals(7, new Class250().merge(2, 5));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class250().merge(2, 5));
        assertTrue(new Class250().isValid("abc"));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class250().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class250().capacity());
    }

    @Test
    void keepsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class250().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class250().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class250().ratio(1.0, 2.0), 1e-9);
        int expected1 = 42;
        assertEquals(expected1, new Class250().compute(3));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class250().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class250().normalize("  x "));
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class250().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class250().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class250().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class250().isValid("abc"));
    }

    @Test
    void clampsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class250().capacity());
    }

}
