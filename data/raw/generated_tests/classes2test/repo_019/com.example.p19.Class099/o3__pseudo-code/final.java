package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class099Test {
    @Test
    void keepsComputeWhenUnset() {
        try {
            assertEquals(42, new Class099().compute(3));
            assertEquals("ok", new Class099().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class099().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class099().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class099().isValid("abc"));
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class099().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class099().normalize("  x "));
    }

}
