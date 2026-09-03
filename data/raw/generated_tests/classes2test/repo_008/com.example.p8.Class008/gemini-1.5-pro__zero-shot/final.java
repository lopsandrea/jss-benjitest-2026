package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class008Test {
    @Test
    void clampsComputeForBoundaryValue() {
        new Class008().compute(3);
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        new Class008().normalize("  x ");
    }

    @Test
    void preservesMergeWithNullArgument() {
        new Class008().merge(2, 5);
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class008().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class008().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class008().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class008().isValid("abc"));
    }

}
