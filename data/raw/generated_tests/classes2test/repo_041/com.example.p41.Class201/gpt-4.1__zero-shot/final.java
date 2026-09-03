package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class201Test {
    @Test
    void yieldsComputeAtUpperBound() {
        new Class201().compute(3);
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        new Class201().normalize("  x ");
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class201().merge(2, 5));
        assertTrue(new Class201().isValid("abc"));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class201().isValid("abc"));
        assertEquals(42, new Class201().compute(3));
    }

    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class201().compute(3));
        assertEquals("ok", new Class201().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class201().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class201().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class201().merge(2, 5));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class201().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class201().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class201().merge(2, 5));
    }

}
