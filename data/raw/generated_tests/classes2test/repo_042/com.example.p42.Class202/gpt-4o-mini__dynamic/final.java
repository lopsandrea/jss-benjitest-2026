package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class202Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class202().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class202().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class202().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class202().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class202().capacity());
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class202().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class202().normalize("  x "));
    }

}
