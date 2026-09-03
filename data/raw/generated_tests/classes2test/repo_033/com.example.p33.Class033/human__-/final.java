package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class033Test {
    @Test
    void shouldFailFastComputeOnMixedCase() {
        try {
            new Class033().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeOnEmptyString() {
        assertEquals("ok", new Class033().normalize("  x "));
        assertEquals(7, new Class033().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeAtZero() {
        assertEquals(7, new Class033().merge(2, 5));
        assertTrue(new Class033().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidOnEmptyString() {
        assertTrue(new Class033().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityWithNullArgument() {
        assertEquals(16, new Class033().capacity());
    }

    @Test
    void shouldReturnRatioForKnownCode() {
        assertEquals(0.5, new Class033().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class033().labelFor(1));
    }

    @Test
    void shouldFailFastComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class033().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnEmptyString() {
        assertEquals("ok", new Class033().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class033().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWithNullArgument() {
        assertTrue(new Class033().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class033().capacity());
    }

    @Test
    void shouldRejectRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class033().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForWithNegativeInput() {
        assertEquals("alpha", new Class033().labelFor(1));
    }

    @Test
    void shouldKeepComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class033().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class033().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class033().compute(3));
    }

}
