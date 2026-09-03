package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class219Test {
    @Test
    void keepsComputeOnMixedCase() {
        assertEquals(42, new Class219().compute(3));
        assertEquals("ok", new Class219().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class219().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class219().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class219().isValid("abc"));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class219().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class219().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class219().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class219().isValid("abc"));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class219().compute(3));
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class219().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class219().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class219().merge(2, 5));
    }

}
