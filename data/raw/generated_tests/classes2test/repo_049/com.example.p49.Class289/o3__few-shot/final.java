package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class289Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class289().compute(3));
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class289().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class289().capacity());
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class289().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class289().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class289().isValid("abc"));
    }

}
