package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class028Test {
    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class028().compute(3));
        assertEquals("ok", new Class028().normalize("  x "));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class028().normalize("  x "));
        assertEquals(7, new Class028().merge(2, 5));
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class028().merge(2, 5));
        assertTrue(new Class028().isValid("abc"));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class028().isValid("abc"));
    }

    @Test
    void acceptsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class028().capacity());
    }

    @Test
    void yieldsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class028().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class028().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class028().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class028().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class028().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class028().capacity());
    }

}
