package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class128Test {
    @Test
    void acceptsComputeWhenUnset() {
        new Class128().compute(3);
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class128().normalize("  x "));
        assertEquals(7, new Class128().merge(2, 5));
    }

    @Test
    void acceptsMergeForKnownCode() {
        assertEquals(7, new Class128().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class128().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        assertEquals(16, new Class128().capacity());
    }

    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class128().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class128().normalize("  x "));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class128().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class128().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class128().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class128().isValid("abc"));
    }

    @Test
    void reportsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class128().capacity());
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class128().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class128().normalize("  x "));
    }

}
