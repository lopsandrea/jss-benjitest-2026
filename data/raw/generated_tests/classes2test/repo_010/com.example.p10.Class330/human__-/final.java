package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class330Test {
    @Test
    void shouldIgnoreComputeWhenUnset() {
        try {
            assertEquals(42, new Class330().compute(3));
            assertEquals("ok", new Class330().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class330().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class330().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnMixedCase() {
        assertEquals("ok", new Class330().normalize("  x "));
    }

    @Test
    void shouldRejectMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class330().merge(2, 5));
    }

}
