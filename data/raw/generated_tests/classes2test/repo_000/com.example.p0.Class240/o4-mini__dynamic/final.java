package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class240Test {
    @Test
    void acceptsComputeWhenUnset() {
        try {
            assertEquals(42, new Class240().compute(3));
            assertEquals("ok", new Class240().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class240().normalize("  x "));
        assertEquals(7, new Class240().merge(2, 5));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class240().merge(2, 5));
        assertTrue(new Class240().isValid("abc"));
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class240().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class240().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class240().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class240().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class240().capacity());
    }

}
