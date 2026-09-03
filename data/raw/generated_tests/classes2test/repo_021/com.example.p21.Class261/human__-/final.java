package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class261Test {
    @Test
    void shouldKeepComputeOnEmptyString() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            new Class261().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeWithNegativeInput() {
        assertEquals("ok", new Class261().normalize("  x "));
        assertEquals(7, new Class261().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeOnRepeatedCall() {
        assertEquals(7, new Class261().merge(2, 5));
        assertTrue(new Class261().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidWhenUnset() {
        assertTrue(new Class261().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class261().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class261().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class261().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class261().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class261().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeForKnownCode() {
        assertEquals("ok", new Class261().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class261().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWhenAlreadyValid() {
        assertTrue(new Class261().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class261().capacity());
    }

    @Test
    void shouldKeepRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class261().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class261().compute(3));
    }

    @Test
    void shouldRoundTripComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class261().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class261().normalize("  x "));
    }

}
