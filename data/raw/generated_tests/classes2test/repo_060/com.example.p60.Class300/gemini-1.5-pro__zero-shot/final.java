package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class300Test {
    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class300().compute(3));
        assertEquals("ok", new Class300().normalize("  x "));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class300().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class300().merge(2, 5));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class300().merge(2, 5));
        assertTrue(new Class300().isValid("abc"));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class300().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class300().capacity());
    }

    @Test
    void reportsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class300().capacity());
    }

    @Test
    void returnsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class300().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForAtZero() {
        assertEquals("alpha", new Class300().labelFor(1));
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class300().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class300().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class300().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class300().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class300().capacity());
    }

    @Test
    void acceptsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class300().ratio(1.0, 2.0), 1e-9);
    }

}
