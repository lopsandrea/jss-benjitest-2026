package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class352Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class352().compute(3));
        assertEquals("ok", new Class352().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class352().normalize("  x "));
        assertEquals(7, new Class352().merge(2, 5));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        assertEquals(7, new Class352().merge(2, 5));
        assertTrue(new Class352().isValid("abc"));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class352().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class352().capacity());
    }

    @Test
    void returnsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class352().capacity());
    }

    @Test
    void returnsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class352().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class352().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class352().normalize("  x "));
    }

}
