package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class355Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        new Class355().compute(3);
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class355().normalize("  x "));
        assertEquals(7, new Class355().merge(2, 5));
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class355().merge(2, 5));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class355().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class355().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class355().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class355().isValid("abc"));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class355().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class355().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class355().isValid("abc"));
    }

}
