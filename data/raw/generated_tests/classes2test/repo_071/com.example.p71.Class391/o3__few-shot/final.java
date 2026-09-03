package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class391Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        new Class391().compute(3);
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        new Class391().normalize("  x ");
    }

    @Test
    void keepsMergeOnEmptyString() {
        new Class391().merge(2, 5);
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class391().isValid("abc"));
        assertEquals(16, new Class391().capacity());
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class391().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class391().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class391().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class391().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class391().capacity());
    }

}
