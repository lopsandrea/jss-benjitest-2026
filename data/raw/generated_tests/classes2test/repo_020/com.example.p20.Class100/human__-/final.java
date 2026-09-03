package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class100Test {
    @Test
    void shouldKeepComputeForBoundaryValue() {
        assertEquals(42, new Class100().compute(3));
        assertEquals("ok", new Class100().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class100().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class100().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class100().merge(2, 5));
        assertTrue(new Class100().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidForBoundaryValue() {
        assertTrue(new Class100().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class100().capacity());
    }

    @Test
    void shouldRoundTripCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class100().capacity());
    }

    @Test
    void shouldFailFastRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class100().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForAtZero() {
        assertEquals("alpha", new Class100().labelFor(1));
    }

    @Test
    void shouldRejectResetAtZero() {
        new Class100().reset();
        assertNotNull(new Class100());
    }

    @Test
    void shouldNotThrowOnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class100().compute(3));
    }

    @Test
    void shouldNotThrowOnComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class100().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class100().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class100().merge(2, 5));
    }

}
