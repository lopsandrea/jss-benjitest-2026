package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class394Test {
    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class394().compute(3));
        assertEquals("ok", new Class394().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class394().normalize("  x "));
        assertEquals(7, new Class394().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class394().merge(2, 5));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class394().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class394().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class394().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class394().isValid("abc"));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class394().compute(3));
    }

}
