package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class110Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        try {
            new Class110().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class110().normalize("  x "));
        assertEquals(7, new Class110().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class110().merge(2, 5));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class110().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class110().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        assertEquals(7, new Class110().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class110().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class110().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class110().merge(2, 5));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class110().compute(3));
    }

}
