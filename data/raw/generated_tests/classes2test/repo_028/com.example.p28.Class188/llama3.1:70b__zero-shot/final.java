package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class188Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        new Class188().compute(3);
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class188().normalize("  x "));
        assertEquals(7, new Class188().merge(2, 5));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class188().merge(2, 5));
        assertTrue(new Class188().isValid("abc"));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class188().isValid("abc"));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class188().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class188().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class188().merge(2, 5));
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class188().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class188().normalize("  x "));
    }

}
