package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class362Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class362().compute(3));
        assertEquals("ok", new Class362().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class362().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class362().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class362().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class362().capacity());
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class362().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class362().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class362().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class362().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class362().capacity());
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class362().compute(3));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class362().compute(3));
    }

}
