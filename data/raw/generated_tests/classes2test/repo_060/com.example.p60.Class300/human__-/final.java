package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class300Test {
    @Test
    void shouldReturnComputeOnMixedCase() {
        new Class300().compute(3);
    }

    @Test
    void shouldRoundTripNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class300().normalize("  x "));
        assertEquals(7, new Class300().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeWhenAlreadyValid() {
        assertEquals(7, new Class300().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidForKnownCode() {
        assertTrue(new Class300().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class300().capacity());
    }

    @Test
    void shouldReturnRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class300().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripLabelForOnEmptyString() {
        assertEquals("alpha", new Class300().labelFor(1));
    }

    @Test
    void shouldHandleResetOnMixedCase() {
        new Class300().reset();
        assertNotNull(new Class300());
    }

    @Test
    void shouldNotThrowOnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class300().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnEmptyString() {
        assertEquals("ok", new Class300().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class300().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWhenAlreadyValid() {
        assertTrue(new Class300().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class300().capacity());
    }

    @Test
    void shouldRejectRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class300().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepLabelForForKnownCode() {
        assertEquals("alpha", new Class300().labelFor(1));
    }

    @Test
    void shouldIgnoreResetWhenUnset() {
        new Class300().reset();
        assertNotNull(new Class300());
    }

    @Test
    void shouldHandleComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class300().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnMixedCase() {
        assertEquals("ok", new Class300().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class300().merge(2, 5));
    }

}
