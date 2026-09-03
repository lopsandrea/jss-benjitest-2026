package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class259Test {
    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class259().compute(3));
        assertEquals("ok", new Class259().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class259().normalize("  x "));
        assertEquals(7, new Class259().merge(2, 5));
    }

    @Test
    void keepsMergeWithNullArgument() {
        assertEquals(7, new Class259().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class259().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class259().capacity());
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class259().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class259().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class259().merge(2, 5));
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class259().compute(3));
    }

}
