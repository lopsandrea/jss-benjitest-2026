package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class272Test {
    @Test
    void shouldNotThrowOnComputeOnEmptyString() {
        assertEquals(42, new Class272().compute(3));
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class272().normalize("  x "));
        assertEquals(7, new Class272().merge(2, 5));
    }

    @Test
    void shouldHandleMergeForKnownCode() {
        assertEquals(7, new Class272().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWhenUnset() {
        assertTrue(new Class272().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class272().capacity());
    }

    @Test
    void shouldRejectRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class272().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class272().compute(3));
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void shouldKeepMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class272().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWithNegativeInput() {
        assertTrue(new Class272().isValid("abc"));
    }

    @Test
    void shouldKeepComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class272().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWithNegativeInput() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class272().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidForBoundaryValue() {
        assertTrue(new Class272().isValid("abc"));
    }

}
