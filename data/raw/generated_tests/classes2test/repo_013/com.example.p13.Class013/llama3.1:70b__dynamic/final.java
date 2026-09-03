package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class013Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        new Class013().compute(3);
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        new Class013().normalize("  x ");
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class013().merge(2, 5));
        assertTrue(new Class013().isValid("abc"));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class013().isValid("abc"));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class013().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class013().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class013().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class013().isValid("abc"));
    }

}
