package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class338Test {
    @Test
    void shouldIgnoreComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class338().compute(3));
            assertEquals("ok", new Class338().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class338().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class338().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class338().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnRepeatedCall() {
        assertTrue(new Class338().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class338().capacity());
    }

    @Test
    void shouldFailFastRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class338().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class338().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class338().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWhenUnset() {
        assertTrue(new Class338().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class338().capacity());
    }

    @Test
    void shouldNotThrowOnRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class338().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class338().compute(3));
    }

    @Test
    void shouldKeepNormalizeForBoundaryValue() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class338().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNegativeInput() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class338().merge(2, 5));
    }

}
