package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class246Test {
    @Test
    void yieldsComputeAtZero() {
        new Class246().compute(3);
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class246().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class246().merge(2, 5));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class246().merge(2, 5));
        assertTrue(new Class246().isValid("abc"));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class246().isValid("abc"));
    }

    @Test
    void acceptsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class246().capacity());
    }

    @Test
    void preservesRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class246().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class246().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class246().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class246().merge(2, 5));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class246().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class246().capacity());
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class246().compute(3));
    }

}
