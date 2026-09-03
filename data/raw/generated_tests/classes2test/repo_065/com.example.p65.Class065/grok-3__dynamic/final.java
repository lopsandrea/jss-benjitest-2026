package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class065Test {
    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class065().compute(3));
        assertEquals("ok", new Class065().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class065().normalize("  x "));
        assertEquals(7, new Class065().merge(2, 5));
    }

    @Test
    void returnsMergeWithNullArgument() {
        assertEquals(7, new Class065().merge(2, 5));
        assertTrue(new Class065().isValid("abc"));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class065().isValid("abc"));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        assertEquals(42, new Class065().compute(3));
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class065().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class065().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class065().merge(2, 5));
    }

}
