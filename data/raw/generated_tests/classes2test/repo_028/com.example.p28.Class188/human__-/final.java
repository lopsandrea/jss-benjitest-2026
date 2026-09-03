package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class188Test {
    @Test
    void shouldRejectComputeWhenAlreadyValid() {
        assertEquals(42, new Class188().compute(3));
        assertEquals("ok", new Class188().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class188().normalize("  x "));
        assertEquals(7, new Class188().merge(2, 5));
    }

    @Test
    void shouldKeepMergeWhenUnset() {
        assertEquals(7, new Class188().merge(2, 5));
        assertTrue(new Class188().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidOnEmptyString() {
        assertTrue(new Class188().isValid("abc"));
    }

    @Test
    void shouldReturnComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class188().compute(3));
    }

    @Test
    void shouldFailFastNormalizeAtZero() {
        assertEquals("ok", new Class188().normalize("  x "));
    }

    @Test
    void shouldRoundTripComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class188().compute(3));
    }

    @Test
    void shouldKeepNormalizeAtZero() {
        assertEquals("ok", new Class188().normalize("  x "));
    }

}
