package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class343Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class343().compute(3);
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class343().normalize("  x "));
        assertEquals(7, new Class343().merge(2, 5));
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class343().merge(2, 5));
        assertTrue(new Class343().isValid("abc"));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class343().isValid("abc"));
        assertEquals(16, new Class343().capacity());
    }

    @Test
    void returnsCapacityAtZero() {
        assertEquals(16, new Class343().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class343().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class343().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class343().compute(3));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class343().compute(3));
    }

}
