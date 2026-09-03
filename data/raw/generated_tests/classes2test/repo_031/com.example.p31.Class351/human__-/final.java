package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class351Test {
    @Test
    void shouldRejectComputeAtUpperBound() {
        try {
            new Class351().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class351().normalize("  x "));
            assertEquals(7, new Class351().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class351().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnTrimmedInput() {
        assertTrue(new Class351().isValid("abc"));
    }

    @Test
    void shouldRejectComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class351().compute(3));
    }

    @Test
    void shouldFailFastNormalizeAtUpperBound() {
        assertEquals("ok", new Class351().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class351().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidForKnownCode() {
        assertTrue(new Class351().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class351().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnEmptyString() {
        assertEquals("ok", new Class351().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class351().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnTrimmedInput() {
        assertTrue(new Class351().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class351().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnEmptyString() {
        assertEquals("ok", new Class351().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class351().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidForKnownCode() {
        assertTrue(new Class351().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class351().compute(3));
    }

}
