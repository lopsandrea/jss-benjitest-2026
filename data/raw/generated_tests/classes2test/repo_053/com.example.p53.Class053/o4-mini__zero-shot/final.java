package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class053Test {
    @Test
    void returnsComputeOnMixedCase() {
        new Class053().compute(3);
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class053().normalize("  x "));
        assertEquals(7, new Class053().merge(2, 5));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        assertEquals(7, new Class053().merge(2, 5));
        assertTrue(new Class053().isValid("abc"));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class053().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class053().capacity());
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class053().capacity());
    }

    @Test
    void rejectsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class053().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class053().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class053().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class053().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class053().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class053().capacity());
    }

    @Test
    void acceptsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class053().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class053().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class053().normalize("  x "));
    }

}
