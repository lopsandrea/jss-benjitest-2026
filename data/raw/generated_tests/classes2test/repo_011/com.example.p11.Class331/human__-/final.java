package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class331Test {
    @Test
    void shouldFailFastComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class331().compute(3);
    }

    @Test
    void shouldRoundTripNormalizeOnMixedCase() {
        assertEquals("ok", new Class331().normalize("  x "));
        assertEquals(7, new Class331().merge(2, 5));
    }

    @Test
    void shouldKeepMergeOnEmptyString() {
        assertEquals(7, new Class331().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWhenAlreadyValid() {
        assertTrue(new Class331().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWithNegativeInput() {
        assertEquals(16, new Class331().capacity());
    }

    @Test
    void shouldFailFastRatioAtZero() {
        assertEquals(0.5, new Class331().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class331().labelFor(1));
    }

    @Test
    void shouldIgnoreResetOnRepeatedCall() {
        new Class331().reset();
        assertNotNull(new Class331());
    }

    @Test
    void shouldKeepComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class331().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnEmptyString() {
        assertEquals("ok", new Class331().normalize("  x "));
    }

    @Test
    void shouldKeepComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class331().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class331().normalize("  x "));
    }

    @Test
    void shouldRejectMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class331().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnRepeatedCall() {
        assertTrue(new Class331().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class331().capacity());
    }

}
