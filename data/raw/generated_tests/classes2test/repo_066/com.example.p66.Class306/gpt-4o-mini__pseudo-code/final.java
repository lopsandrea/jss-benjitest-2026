package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class306Test {
    @Test
    void clampsComputeOnEmptyString() {
        new Class306().compute(3);
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class306().normalize("  x "));
        assertEquals(7, new Class306().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class306().merge(2, 5));
        assertTrue(new Class306().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class306().isValid("abc"));
        assertEquals(16, new Class306().capacity());
    }

    @Test
    void returnsCapacityOnRepeatedCall() {
        assertEquals(16, new Class306().capacity());
    }

    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class306().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class306().normalize("  x "));
    }

}
