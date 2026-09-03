package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class152Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        new Class152().compute(3);
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class152().normalize("  x "));
        assertEquals(7, new Class152().merge(2, 5));
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class152().merge(2, 5));
        assertTrue(new Class152().isValid("abc"));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class152().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class152().compute(3));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class152().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class152().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class152().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class152().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class152().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class152().normalize("  x "));
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class152().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class152().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class152().merge(2, 5));
    }

}
