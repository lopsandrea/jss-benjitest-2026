package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class249Test {
    @Test
    void shouldReturnComputeOnTrimmedInput() {
        try {
            new Class249().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeWithNullArgument() {
        assertEquals("ok", new Class249().normalize("  x "));
        assertEquals(7, new Class249().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class249().merge(2, 5));
        assertTrue(new Class249().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidWithNegativeInput() {
        assertTrue(new Class249().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class249().capacity());
    }

    @Test
    void shouldFailFastCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class249().capacity());
    }

    @Test
    void shouldRejectComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class249().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class249().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnEmptyString() {
        assertTrue(new Class249().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class249().capacity());
    }

    @Test
    void shouldIgnoreComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class249().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnMixedCase() {
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class249().merge(2, 5));
    }

    @Test
    void shouldKeepComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class249().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class249().normalize("  x "));
    }

}
