package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class394Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class394().compute(3));
        assertEquals("ok", new Class394().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class394().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class394().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class394().merge(2, 5));
        assertTrue(new Class394().isValid("abc"));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class394().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class394().compute(3));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class394().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class394().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class394().merge(2, 5));
    }

}
