package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class234Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        new Class234().compute(3);
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class234().normalize("  x "));
        assertEquals(7, new Class234().merge(2, 5));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class234().merge(2, 5));
        assertTrue(new Class234().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class234().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class234().capacity());
    }

    @Test
    void returnsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class234().capacity());
    }

    @Test
    void rejectsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class234().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class234().labelFor(1));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class234().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class234().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class234().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class234().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class234().capacity());
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class234().compute(3));
    }

}
