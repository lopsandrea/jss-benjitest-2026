package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class053Test {
    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class053().compute(3));
        assertEquals("ok", new Class053().normalize("  x "));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class053().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class053().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class053().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class053().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class053().capacity());
    }

    @Test
    void reportsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class053().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class053().compute(3));
    }

}
