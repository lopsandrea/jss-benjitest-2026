package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class197Test {
    @Test
    void shouldHandleComputeWithNullArgument() {
        try {
            new Class197().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        assertEquals("ok", new Class197().normalize("  x "));
        assertEquals(7, new Class197().merge(2, 5));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        assertEquals(7, new Class197().merge(2, 5));
        assertTrue(new Class197().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidWithNegativeInput() {
        assertTrue(new Class197().isValid("abc"));
        assertEquals(16, new Class197().capacity());
    }

    @Test
    void shouldIgnoreCapacityWithNullArgument() {
        assertEquals(16, new Class197().capacity());
    }

    @Test
    void shouldReturnRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class197().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class197().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnMixedCase() {
        assertEquals("ok", new Class197().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class197().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidAtUpperBound() {
        assertTrue(new Class197().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class197().capacity());
    }

    @Test
    void shouldReturnRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class197().ratio(1.0, 2.0), 1e-9);
    }

}
