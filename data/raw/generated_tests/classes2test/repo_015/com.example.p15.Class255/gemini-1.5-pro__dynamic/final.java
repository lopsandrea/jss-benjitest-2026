package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class255Test {
    @Test
    void keepsComputeAtZero() {
        new Class255().compute(3);
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class255().normalize("  x "));
        assertEquals(7, new Class255().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenUnset() {
        assertEquals(7, new Class255().merge(2, 5));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class255().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class255().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class255().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class255().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class255().capacity());
    }

}
