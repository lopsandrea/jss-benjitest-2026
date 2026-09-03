package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class073Test {
    @Test
    void shouldKeepComputeOnTrimmedInput() {
        new Class073().compute(3);
    }

    @Test
    void shouldHandleNormalizeAtZero() {
        new Class073().normalize("  x ");
    }

    @Test
    void shouldNotThrowOnMergeOnMixedCase() {
        assertEquals(7, new Class073().merge(2, 5));
        assertTrue(new Class073().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidWithNegativeInput() {
        assertTrue(new Class073().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class073().capacity());
    }

    @Test
    void shouldRoundTripCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class073().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class073().compute(3));
    }

    @Test
    void shouldKeepComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class073().compute(3));
        assertEquals("ok", new Class073().normalize("  x "));
    }

    @Test
    void shouldFailFastNormalizeOnEmptyString() {
        assertEquals("ok", new Class073().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class073().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class073().merge(2, 5));
        assertTrue(new Class073().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidForKnownCode() {
        assertTrue(new Class073().isValid("abc"));
    }

    @Test
    void shouldReturnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class073().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNegativeInput() {
        assertEquals("ok", new Class073().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class073().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidOnMixedCase() {
        assertTrue(new Class073().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class073().capacity());
    }

}
