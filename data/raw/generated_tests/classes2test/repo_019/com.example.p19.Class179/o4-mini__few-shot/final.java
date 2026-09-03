package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class179Test {
    @Test
    void keepsComputeForKnownCode() {
        try {
            assertEquals(42, new Class179().compute(3));
            assertEquals("ok", new Class179().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class179().normalize("  x "));
        assertEquals(7, new Class179().merge(2, 5));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class179().merge(2, 5));
        assertTrue(new Class179().isValid("abc"));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class179().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class179().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class179().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class179().isValid("abc"));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class179().compute(3));
    }

}
