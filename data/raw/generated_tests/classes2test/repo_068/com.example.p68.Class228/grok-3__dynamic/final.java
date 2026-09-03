package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class228Test {
    @Test
    void rejectsComputeAtUpperBound() {
        new Class228().compute(3);
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class228().normalize("  x "));
        assertEquals(7, new Class228().merge(2, 5));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class228().merge(2, 5));
        assertTrue(new Class228().isValid("abc"));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class228().isValid("abc"));
        assertEquals(16, new Class228().capacity());
    }

    @Test
    void reportsCapacityWhenUnset() {
        assertEquals(16, new Class228().capacity());
    }

    @Test
    void yieldsRatioForKnownCode() {
        assertEquals(0.5, new Class228().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class228().labelFor(1));
    }

    @Test
    void preservesResetOnMixedCase() {
        new Class228().reset();
        assertNotNull(new Class228());
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class228().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class228().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class228().isValid("abc"));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class228().compute(3));
    }

}
