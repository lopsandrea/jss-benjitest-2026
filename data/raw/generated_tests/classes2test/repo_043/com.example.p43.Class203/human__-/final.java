package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class203Test {
    @Test
    void shouldKeepComputeAtUpperBound() {
        new Class203().compute(3);
    }

    @Test
    void shouldReturnNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class203().normalize("  x "));
        assertEquals(7, new Class203().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeWhenAlreadyValid() {
        assertEquals(7, new Class203().merge(2, 5));
        assertTrue(new Class203().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidOnEmptyString() {
        assertTrue(new Class203().isValid("abc"));
        assertEquals(16, new Class203().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class203().capacity());
    }

    @Test
    void shouldNotThrowOnRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class203().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForWithNegativeInput() {
        assertEquals("alpha", new Class203().labelFor(1));
    }

    @Test
    void shouldHandleComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class203().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnEmptyString() {
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class203().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWhenAlreadyValid() {
        assertTrue(new Class203().isValid("abc"));
    }

    @Test
    void shouldKeepComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class203().compute(3));
    }

    @Test
    void shouldRejectNormalizeWhenUnset() {
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class203().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidOnEmptyString() {
        assertTrue(new Class203().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class203().capacity());
    }

}
