package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class019Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        try {
            new Class019().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class019().normalize("  x "));
        assertEquals(7, new Class019().merge(2, 5));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        assertEquals(7, new Class019().merge(2, 5));
        assertTrue(new Class019().isValid("abc"));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class019().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class019().capacity());
    }

}
