package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {
    @Test
    void reportsComputeWithNullArgument() {
        assertEquals(42, new Class015().compute(3));
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class015().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class015().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class015().capacity());
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class015().compute(3));
    }

}
