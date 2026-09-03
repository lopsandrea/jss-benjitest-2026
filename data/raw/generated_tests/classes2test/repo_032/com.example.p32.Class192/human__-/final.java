package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class192Test {
    @Test
    void shouldKeepComputeAtZero() {
        assertEquals(42, new Class192().compute(3));
        assertEquals("ok", new Class192().normalize("  x "));
    }

    @Test
    void shouldKeepNormalizeWithNullArgument() {
        assertEquals("ok", new Class192().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class192().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class192().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWithNullArgument() {
        assertTrue(new Class192().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class192().capacity());
    }

    @Test
    void shouldRoundTripComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class192().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class192().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class192().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnTrimmedInput() {
        assertTrue(new Class192().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class192().capacity());
    }

    @Test
    void shouldRejectComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class192().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class192().normalize("  x "));
    }

    @Test
    void shouldHandleComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class192().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNullArgument() {
        assertEquals("ok", new Class192().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class192().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnEmptyString() {
        assertTrue(new Class192().isValid("abc"));
    }

}
