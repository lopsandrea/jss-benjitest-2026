package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class180Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class180().compute(3));
        assertEquals("ok", new Class180().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class180().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        assertEquals(7, new Class180().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class180().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        assertEquals(16, new Class180().capacity());
    }

    @Test
    void returnsRatioAtUpperBound() {
        assertEquals(0.5, new Class180().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeForKnownCode() {
        assertEquals(42, new Class180().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class180().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        assertEquals(7, new Class180().merge(2, 5));
    }

}
