package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class326Test {
    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class326().compute(3));
        assertEquals("ok", new Class326().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class326().normalize("  x "));
        assertEquals(7, new Class326().merge(2, 5));
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class326().merge(2, 5));
        assertTrue(new Class326().isValid("abc"));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class326().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class326().capacity());
    }

    @Test
    void yieldsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class326().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class326().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class326().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class326().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class326().isValid("abc"));
    }

}
