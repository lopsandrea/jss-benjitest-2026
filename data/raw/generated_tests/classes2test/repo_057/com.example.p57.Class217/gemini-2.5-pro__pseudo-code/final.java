package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class217Test {
    @Test
    void returnsComputeOnMixedCase() {
        new Class217().compute(3);
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class217().normalize("  x "));
        assertEquals(7, new Class217().merge(2, 5));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class217().merge(2, 5));
        assertTrue(new Class217().isValid("abc"));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class217().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        assertEquals(16, new Class217().capacity());
    }

    @Test
    void preservesRatioOnEmptyString() {
        assertEquals(0.5, new Class217().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class217().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class217().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class217().merge(2, 5));
    }

}
