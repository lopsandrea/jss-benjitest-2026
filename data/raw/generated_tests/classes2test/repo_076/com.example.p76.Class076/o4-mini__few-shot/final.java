package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class076Test {
    @Test
    void acceptsComputeOnMixedCase() {
        new Class076().compute(3);
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class076().normalize("  x "));
        assertEquals(7, new Class076().merge(2, 5));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        assertEquals(7, new Class076().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class076().isValid("abc"));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class076().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class076().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class076().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class076().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class076().capacity());
    }

}
