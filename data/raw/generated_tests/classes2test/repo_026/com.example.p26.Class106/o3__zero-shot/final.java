package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class106Test {
    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class106().compute(3));
        assertEquals("ok", new Class106().normalize("  x "));
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class106().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class106().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class106().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class106().isValid("abc"));
    }

}
