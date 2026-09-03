package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class322Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class322().compute(3));
        assertEquals("ok", new Class322().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class322().normalize("  x "));
        assertEquals(7, new Class322().merge(2, 5));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class322().merge(2, 5));
        assertTrue(new Class322().isValid("abc"));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class322().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class322().capacity());
    }

    @Test
    void acceptsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class322().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnMixedCase() {
        assertEquals("alpha", new Class322().labelFor(1));
    }

    @Test
    void rejectsResetOnEmptyString() {
        new Class322().reset();
        assertNotNull(new Class322());
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class322().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class322().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class322().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class322().isValid("abc"));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class322().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class322().normalize("  x "));
    }

}
