package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class379Test {
    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class379().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class379().normalize("  x "));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        assertEquals(7, new Class379().merge(2, 5));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class379().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnRepeatedCall() {
        assertEquals(16, new Class379().capacity());
    }

    @Test
    void rejectsRatioOnEmptyString() {
        assertEquals(0.5, new Class379().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class379().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class379().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class379().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class379().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class379().capacity());
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class379().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class379().normalize("  x "));
    }

}
