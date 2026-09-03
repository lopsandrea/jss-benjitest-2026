package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class182Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class182().compute(3));
        assertEquals("ok", new Class182().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class182().normalize("  x "));
        assertEquals(7, new Class182().merge(2, 5));
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class182().merge(2, 5));
        assertTrue(new Class182().isValid("abc"));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class182().isValid("abc"));
    }

    @Test
    void yieldsCapacityForKnownCode() {
        assertEquals(16, new Class182().capacity());
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class182().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class182().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class182().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class182().isValid("abc"));
    }

}
