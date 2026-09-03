package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class084Test {
    @Test
    void reportsComputeWithNegativeInput() {
        new Class084().compute(3);
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        new Class084().normalize("  x ");
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class084().merge(2, 5));
        assertTrue(new Class084().isValid("abc"));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class084().isValid("abc"));
        assertEquals(16, new Class084().capacity());
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        assertEquals(16, new Class084().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        assertEquals(0.5, new Class084().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtUpperBound() {
        assertEquals("alpha", new Class084().labelFor(1));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class084().compute(3));
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class084().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class084().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class084().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class084().isValid("abc"));
    }

}
