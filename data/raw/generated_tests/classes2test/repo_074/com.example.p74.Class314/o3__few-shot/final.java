package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class314Test {
    @Test
    void keepsComputeForKnownCode() {
        try {
            assertEquals(42, new Class314().compute(3));
            assertEquals("ok", new Class314().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class314().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class314().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class314().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class314().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class314().capacity());
    }

}
