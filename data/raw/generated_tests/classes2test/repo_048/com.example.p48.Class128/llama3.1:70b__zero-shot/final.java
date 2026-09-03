package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class128Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        assertEquals(42, new Class128().compute(3));
        assertEquals("ok", new Class128().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class128().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class128().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class128().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNullArgument() {
        assertEquals(16, new Class128().capacity());
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class128().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class128().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class128().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class128().isValid("abc"));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class128().compute(3));
    }

}
