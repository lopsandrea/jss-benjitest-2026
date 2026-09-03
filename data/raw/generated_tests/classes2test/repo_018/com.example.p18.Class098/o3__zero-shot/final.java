package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class098Test {
    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class098().compute(3));
        assertEquals("ok", new Class098().normalize("  x "));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class098().normalize("  x "));
        assertEquals(7, new Class098().merge(2, 5));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        assertEquals(7, new Class098().merge(2, 5));
        assertTrue(new Class098().isValid("abc"));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class098().isValid("abc"));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class098().compute(3));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class098().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class098().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class098().merge(2, 5));
    }

}
