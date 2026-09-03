package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class018Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        assertEquals(42, new Class018().compute(3));
        assertEquals("ok", new Class018().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class018().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class018().merge(2, 5));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class018().merge(2, 5));
        assertTrue(new Class018().isValid("abc"));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class018().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class018().capacity());
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class018().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class018().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class018().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class018().isValid("abc"));
    }

}
