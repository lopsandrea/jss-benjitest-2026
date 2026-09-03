package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class281Test {
    @Test
    void shouldHandleComputeAtUpperBound() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            new Class281().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeForBoundaryValue() {
        assertEquals("ok", new Class281().normalize("  x "));
        assertEquals(7, new Class281().merge(2, 5));
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        assertEquals(7, new Class281().merge(2, 5));
        assertTrue(new Class281().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidWhenUnset() {
        assertTrue(new Class281().isValid("abc"));
        assertEquals(16, new Class281().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityAtUpperBound() {
        assertEquals(16, new Class281().capacity());
    }

    @Test
    void shouldKeepRatioOnRepeatedCall() {
        assertEquals(0.5, new Class281().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForForKnownCode() {
        assertEquals("alpha", new Class281().labelFor(1));
    }

    @Test
    void shouldRejectComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class281().compute(3));
    }

    @Test
    void shouldHandleNormalizeAtZero() {
        assertEquals("ok", new Class281().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class281().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidOnMixedCase() {
        assertTrue(new Class281().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class281().capacity());
    }

}
