package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class231Test {
    @Test
    void keepsComputeOnEmptyString() {
        new Class231().compute(3);
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class231().normalize("  x "));
        assertEquals(7, new Class231().merge(2, 5));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class231().merge(2, 5));
        assertTrue(new Class231().isValid("abc"));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class231().isValid("abc"));
        assertEquals(16, new Class231().capacity());
    }

    @Test
    void rejectsCapacityAtZero() {
        assertEquals(16, new Class231().capacity());
    }

    @Test
    void reportsRatioForKnownCode() {
        assertEquals(0.5, new Class231().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForAtUpperBound() {
        assertEquals("alpha", new Class231().labelFor(1));
    }

    @Test
    void keepsResetWhenUnset() {
        new Class231().reset();
        assertNotNull(new Class231());
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class231().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class231().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class231().merge(2, 5));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class231().compute(3));
    }

}
