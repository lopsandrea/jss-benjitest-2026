package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class245Test {
    @Test
    void returnsComputeWhenUnset() {
        new Class245().compute(3);
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class245().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class245().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class245().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class245().isValid("abc"));
    }

    @Test
    void returnsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class245().capacity());
    }

}
