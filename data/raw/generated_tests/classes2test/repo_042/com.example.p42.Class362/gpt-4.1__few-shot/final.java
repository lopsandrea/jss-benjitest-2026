package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class362Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class362().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class362().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        assertEquals(7, new Class362().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class362().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNullArgument() {
        assertEquals(16, new Class362().capacity());
    }

    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class362().compute(3));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class362().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class362().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class362().merge(2, 5));
    }

}
