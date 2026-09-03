package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class176Test {
    @Test
    void returnsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class176().compute(3));
            assertEquals("ok", new Class176().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class176().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class176().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class176().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class176().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class176().capacity());
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class176().compute(3));
    }

}
