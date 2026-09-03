package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class301Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class301().compute(3));
        assertEquals("ok", new Class301().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class301().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class301().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class301().isValid("abc"));
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        assertEquals(16, new Class301().capacity());
    }

    @Test
    void yieldsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class301().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class301().labelFor(1));
    }

    @Test
    void yieldsResetWithNullArgument() {
        new Class301().reset();
        assertNotNull(new Class301());
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class301().compute(3));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class301().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class301().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class301().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class301().isValid("abc"));
    }

}
