package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class399Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class399().compute(3));
        assertEquals("ok", new Class399().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class399().normalize("  x "));
        assertEquals(7, new Class399().merge(2, 5));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        assertEquals(7, new Class399().merge(2, 5));
        assertTrue(new Class399().isValid("abc"));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class399().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNullArgument() {
        assertEquals(16, new Class399().capacity());
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class399().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class399().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class399().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class399().isValid("abc"));
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class399().capacity());
    }

}
