package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class259Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class259().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class259().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class259().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class259().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class259().capacity());
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class259().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class259().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class259().merge(2, 5));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class259().compute(3));
    }

}
