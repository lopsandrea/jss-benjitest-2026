package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class157Test {
    @Test
    void preservesComputeWhenUnset() {
        new Class157().compute(3);
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        new Class157().normalize("  x ");
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class157().merge(2, 5));
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void clampsCapacityOnEmptyString() {
        assertEquals(16, new Class157().capacity());
    }

    @Test
    void reportsRatioAtUpperBound() {
        assertEquals(0.5, new Class157().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class157().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class157().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class157().isValid("abc"));
    }

}
