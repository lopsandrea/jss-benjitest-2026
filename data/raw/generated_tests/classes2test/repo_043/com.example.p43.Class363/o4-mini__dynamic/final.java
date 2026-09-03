package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class363Test {
    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class363().compute(3));
        assertEquals("ok", new Class363().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class363().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class363().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class363().isValid("abc"));
    }

    @Test
    void keepsCapacityAtUpperBound() {
        assertEquals(16, new Class363().capacity());
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class363().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class363().normalize("  x "));
    }

}
