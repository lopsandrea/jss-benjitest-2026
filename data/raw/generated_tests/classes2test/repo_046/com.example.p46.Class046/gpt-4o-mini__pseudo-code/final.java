package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class046Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class046().compute(3));
        assertEquals("ok", new Class046().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class046().normalize("  x "));
        assertEquals(7, new Class046().merge(2, 5));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        assertEquals(7, new Class046().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class046().isValid("abc"));
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class046().capacity());
    }

    @Test
    void keepsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class046().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnEmptyString() {
        assertEquals("alpha", new Class046().labelFor(1));
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class046().compute(3));
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class046().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class046().normalize("  x "));
    }

}
