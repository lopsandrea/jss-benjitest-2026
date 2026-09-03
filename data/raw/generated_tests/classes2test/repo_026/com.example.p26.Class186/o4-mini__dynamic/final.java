package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class186Test {
    @Test
    void yieldsComputeWhenAlreadyValid() {
        assertEquals(42, new Class186().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class186().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class186().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class186().isValid("abc"));
    }

    @Test
    void reportsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class186().capacity());
    }

}
