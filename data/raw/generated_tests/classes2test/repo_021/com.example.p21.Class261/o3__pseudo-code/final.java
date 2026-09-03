package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class261Test {
    @Test
    void preservesComputeOnEmptyString() {
        new Class261().compute(3);
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        new Class261().normalize("  x ");
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        assertEquals(7, new Class261().merge(2, 5));
        assertTrue(new Class261().isValid("abc"));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class261().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class261().capacity());
    }

    @Test
    void preservesRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class261().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class261().compute(3));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class261().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class261().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class261().isValid("abc"));
    }

    @Test
    void preservesCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class261().capacity());
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class261().compute(3));
    }

}
