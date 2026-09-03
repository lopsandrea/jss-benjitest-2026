package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class394Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class394().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class394().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class394().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class394().isValid("abc"));
    }

}
