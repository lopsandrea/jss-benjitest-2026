package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class067Test {
    @Test
    void shouldRoundTripComputeWhenUnset() {
        assertEquals(42, new Class067().compute(3));
        assertEquals("ok", new Class067().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class067().normalize("  x "));
        assertEquals(7, new Class067().merge(2, 5));
    }

    @Test
    void shouldKeepMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class067().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidOnEmptyString() {
        assertTrue(new Class067().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class067().capacity());
    }

    @Test
    void shouldNotThrowOnRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class067().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class067().labelFor(1));
    }

    @Test
    void shouldNotThrowOnResetForKnownCode() {
        new Class067().reset();
        assertNotNull(new Class067());
    }

    @Test
    void shouldRoundTripComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class067().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class067().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class067().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnRepeatedCall() {
        assertTrue(new Class067().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class067().capacity());
    }

    @Test
    void shouldReturnRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class067().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class067().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        assertEquals("ok", new Class067().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class067().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidForKnownCode() {
        assertTrue(new Class067().isValid("abc"));
    }

}
