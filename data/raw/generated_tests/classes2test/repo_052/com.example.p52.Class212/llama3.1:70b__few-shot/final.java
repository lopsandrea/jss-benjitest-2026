package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class212Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class212().compute(3));
        assertEquals("ok", new Class212().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class212().normalize("  x "));
        assertEquals(7, new Class212().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class212().merge(2, 5));
        assertTrue(new Class212().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class212().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class212().capacity());
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class212().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class212().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class212().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class212().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class212().capacity());
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class212().compute(3));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class212().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class212().normalize("  x "));
    }

}
