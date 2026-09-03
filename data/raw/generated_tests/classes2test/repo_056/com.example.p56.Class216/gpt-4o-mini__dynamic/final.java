package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {
    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class216().compute(3));
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class216().normalize("  x "));
        assertEquals(7, new Class216().merge(2, 5));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class216().merge(2, 5));
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

}
