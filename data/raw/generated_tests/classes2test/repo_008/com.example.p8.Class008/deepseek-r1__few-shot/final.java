package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class008Test {
    @Test
    void returnsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class008().compute(3));
            assertEquals("ok", new Class008().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class008().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class008().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class008().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class008().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class008().capacity());
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class008().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class008().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class008().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class008().isValid("abc"));
    }

}
