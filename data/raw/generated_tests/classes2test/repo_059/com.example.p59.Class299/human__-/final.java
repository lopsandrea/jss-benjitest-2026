package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class299Test {
    @Test
    void shouldKeepComputeForKnownCode() {
        try {
            assertEquals(42, new Class299().compute(3));
            assertEquals("ok", new Class299().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeWithNegativeInput() {
        assertEquals("ok", new Class299().normalize("  x "));
        assertEquals(7, new Class299().merge(2, 5));
    }

    @Test
    void shouldReturnMergeOnTrimmedInput() {
        assertEquals(7, new Class299().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidForKnownCode() {
        assertTrue(new Class299().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnMixedCase() {
        assertEquals(16, new Class299().capacity());
    }

    @Test
    void shouldReturnRatioWhenUnset() {
        assertEquals(0.5, new Class299().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class299().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeForKnownCode() {
        assertEquals("ok", new Class299().normalize("  x "));
    }

}
