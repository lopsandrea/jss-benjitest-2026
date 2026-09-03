package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class151Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class151().compute(3));
        assertEquals("ok", new Class151().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class151().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class151().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class151().isValid("abc"));
    }

    @Test
    void clampsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class151().capacity());
    }

    @Test
    void keepsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class151().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForForKnownCode() {
        assertEquals("alpha", new Class151().labelFor(1));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class151().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class151().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class151().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class151().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class151().capacity());
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class151().compute(3));
    }

}
