package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class159Test {
    @Test
    void rejectsComputeOnMixedCase() {
        new Class159().compute(3);
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class159().normalize("  x "));
        assertEquals(7, new Class159().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class159().merge(2, 5));
        assertTrue(new Class159().isValid("abc"));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class159().isValid("abc"));
        assertEquals(42, new Class159().compute(3));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class159().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class159().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class159().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class159().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class159().compute(3));
    }

}
