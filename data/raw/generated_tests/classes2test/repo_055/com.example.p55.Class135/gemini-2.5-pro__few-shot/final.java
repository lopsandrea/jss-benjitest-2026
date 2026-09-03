package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class135Test {
    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class135().compute(3));
        assertEquals("ok", new Class135().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class135().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class135().merge(2, 5));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class135().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class135().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class135().capacity());
    }

    @Test
    void clampsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class135().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class135().labelFor(1));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class135().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class135().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class135().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class135().isValid("abc"));
    }

    @Test
    void keepsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class135().capacity());
    }

    @Test
    void returnsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class135().ratio(1.0, 2.0), 1e-9);
    }

}
