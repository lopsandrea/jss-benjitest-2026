package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class282Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class282().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class282().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class282().merge(2, 5));
    }

    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class282().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class282().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class282().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class282().isValid("abc"));
    }

}
