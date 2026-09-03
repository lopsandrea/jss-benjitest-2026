package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class071Test {
    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class071().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class071().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class071().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class071().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        assertEquals(16, new Class071().capacity());
    }

    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class071().compute(3));
    }

}
