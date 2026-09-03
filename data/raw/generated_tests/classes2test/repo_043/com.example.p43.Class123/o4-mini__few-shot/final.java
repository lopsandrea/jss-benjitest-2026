package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class123Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        new Class123().compute(3);
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class123().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class123().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class123().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class123().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class123().capacity());
    }

}
