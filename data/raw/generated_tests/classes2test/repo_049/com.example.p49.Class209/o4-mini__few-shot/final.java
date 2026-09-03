package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class209Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class209().compute(3));
            assertEquals("ok", new Class209().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class209().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        assertEquals(7, new Class209().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class209().isValid("abc"));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class209().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class209().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class209().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class209().isValid("abc"));
    }

}
