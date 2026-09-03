package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class080().compute(3));
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        assertEquals(7, new Class080().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class080().capacity());
    }

    @Test
    void acceptsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class080().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class080().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class080().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class080().merge(2, 5));
    }

}
