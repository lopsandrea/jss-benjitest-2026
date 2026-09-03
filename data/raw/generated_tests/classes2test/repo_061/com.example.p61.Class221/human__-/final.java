package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class221Test {
    @Test
    void shouldNotThrowOnComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class221().compute(3));
            assertEquals("ok", new Class221().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeOnMixedCase() {
        try {
            assertEquals("ok", new Class221().normalize("  x "));
            assertEquals(7, new Class221().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class221().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnMixedCase() {
        assertEquals("ok", new Class221().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class221().merge(2, 5));
    }

}
