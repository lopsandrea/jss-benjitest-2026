package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class134Test {
    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class134().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class134().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class134().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class134().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class134().capacity());
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class134().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class134().normalize("  x "));
    }

    @Test
    void acceptsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class134().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class134().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class134().capacity());
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class134().compute(3));
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class134().compute(3));
    }

}
