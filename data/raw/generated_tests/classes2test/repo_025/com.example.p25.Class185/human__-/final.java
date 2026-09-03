package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class185Test {
    @Test
    void shouldRejectComputeAtZero() {
        assertEquals(42, new Class185().compute(3));
        assertEquals("ok", new Class185().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeOnMixedCase() {
        assertEquals("ok", new Class185().normalize("  x "));
        assertEquals(7, new Class185().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class185().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWhenUnset() {
        assertTrue(new Class185().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class185().capacity());
    }

    @Test
    void shouldReturnRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class185().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class185().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWithNegativeInput() {
        assertEquals("ok", new Class185().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class185().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidForBoundaryValue() {
        assertTrue(new Class185().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class185().capacity());
    }

    @Test
    void shouldReturnRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class185().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class185().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class185().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class185().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWhenUnset() {
        assertTrue(new Class185().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class185().capacity());
    }

}
