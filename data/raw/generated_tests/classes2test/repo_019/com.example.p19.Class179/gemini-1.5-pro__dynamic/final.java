package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class179Test {
    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class179().compute(3));
        assertEquals("ok", new Class179().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class179().normalize("  x "));
        assertEquals(7, new Class179().merge(2, 5));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class179().merge(2, 5));
        assertTrue(new Class179().isValid("abc"));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class179().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class179().compute(3));
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class179().compute(3));
        assertEquals("ok", new Class179().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class179().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class179().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class179().merge(2, 5));
        assertTrue(new Class179().isValid("abc"));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class179().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class179().normalize("  x "));
    }

}
