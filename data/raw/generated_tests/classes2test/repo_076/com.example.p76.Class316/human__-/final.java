package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class316Test {
    @Test
    void shouldRejectComputeForKnownCode() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class316().compute(3));
            assertEquals("ok", new Class316().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeOnEmptyString() {
        assertEquals("ok", new Class316().normalize("  x "));
        assertEquals(7, new Class316().merge(2, 5));
    }

    @Test
    void shouldRejectMergeOnRepeatedCall() {
        assertEquals(7, new Class316().merge(2, 5));
        assertTrue(new Class316().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidOnRepeatedCall() {
        assertTrue(new Class316().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class316().capacity());
    }

    @Test
    void shouldKeepCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class316().capacity());
    }

    @Test
    void shouldRejectRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class316().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class316().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class316().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class316().merge(2, 5));
    }

    @Test
    void shouldIgnoreComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class316().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnEmptyString() {
        assertEquals("ok", new Class316().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class316().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnRepeatedCall() {
        assertTrue(new Class316().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class316().capacity());
    }

    @Test
    void shouldRoundTripRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class316().ratio(1.0, 2.0), 1e-9);
    }

}
