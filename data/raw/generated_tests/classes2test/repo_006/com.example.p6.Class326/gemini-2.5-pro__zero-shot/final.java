package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class326Test {
    @Test
    void yieldsComputeAtUpperBound() {
        new Class326().compute(3);
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class326().normalize("  x "));
        assertEquals(7, new Class326().merge(2, 5));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class326().merge(2, 5));
        assertTrue(new Class326().isValid("abc"));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class326().isValid("abc"));
    }

    @Test
    void reportsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class326().capacity());
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class326().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class326().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class326().isValid("abc"));
    }

}
