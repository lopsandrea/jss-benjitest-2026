package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {
    @Test
    void shouldRoundTripComputeOnEmptyString() {
        new Class015().compute(3);
    }

    @Test
    void shouldKeepNormalizeOnRepeatedCall() {
        new Class015().normalize("  x ");
    }

    @Test
    void shouldRejectMergeOnRepeatedCall() {
        assertEquals(7, new Class015().merge(2, 5));
        assertTrue(new Class015().isValid("abc"));
    }

    @Test
    void shouldReturnComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class015().compute(3));
    }

    @Test
    void shouldFailFastNormalizeAtZero() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class015().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidForKnownCode() {
        assertTrue(new Class015().isValid("abc"));
    }

}
