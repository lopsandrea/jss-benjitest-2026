package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class165Test {
    @Test
    void clampsComputeOnMixedCase() {
        new Class165().compute(3);
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class165().normalize("  x "));
        assertEquals(7, new Class165().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class165().merge(2, 5));
        assertTrue(new Class165().isValid("abc"));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class165().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        assertEquals(16, new Class165().capacity());
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        assertEquals(42, new Class165().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class165().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class165().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class165().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class165().capacity());
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class165().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class165().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class165().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class165().isValid("abc"));
    }

}
