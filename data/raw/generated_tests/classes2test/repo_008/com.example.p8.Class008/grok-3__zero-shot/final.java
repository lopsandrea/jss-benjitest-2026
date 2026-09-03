package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class008Test {
    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class008().compute(3));
        assertEquals("ok", new Class008().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class008().normalize("  x "));
        assertEquals(7, new Class008().merge(2, 5));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class008().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class008().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        assertEquals(16, new Class008().capacity());
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class008().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class008().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class008().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class008().isValid("abc"));
    }

    @Test
    void clampsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class008().capacity());
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class008().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class008().normalize("  x "));
    }

}
