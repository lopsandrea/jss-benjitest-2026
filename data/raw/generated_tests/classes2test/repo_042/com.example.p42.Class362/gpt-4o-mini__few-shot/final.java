package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class362Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        assertEquals(42, new Class362().compute(3));
        assertEquals("ok", new Class362().normalize("  x "));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class362().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class362().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class362().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        assertEquals(16, new Class362().capacity());
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class362().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class362().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class362().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class362().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class362().capacity());
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class362().compute(3));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class362().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class362().normalize("  x "));
    }

}
