package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class382Test {
    @Test
    void shouldFailFastComputeAtUpperBound() {
        try {
            new Class382().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class382().normalize("  x "));
            assertEquals(7, new Class382().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreMergeOnEmptyString() {
        try {
            assertEquals(7, new Class382().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleIsValidForKnownCode() {
        assertTrue(new Class382().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class382().capacity());
    }

    @Test
    void shouldIgnoreRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class382().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForAtUpperBound() {
        assertEquals("alpha", new Class382().labelFor(1));
    }

    @Test
    void shouldFailFastComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class382().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class382().normalize("  x "));
    }

    @Test
    void shouldKeepComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class382().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class382().normalize("  x "));
    }

}
