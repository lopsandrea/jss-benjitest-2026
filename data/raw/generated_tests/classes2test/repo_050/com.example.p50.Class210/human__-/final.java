package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class210Test {
    @Test
    void shouldReturnComputeWhenUnset() {
        assertEquals(42, new Class210().compute(3));
        assertEquals("ok", new Class210().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeOnEmptyString() {
        assertEquals("ok", new Class210().normalize("  x "));
        assertEquals(7, new Class210().merge(2, 5));
    }

    @Test
    void shouldRejectMergeWhenAlreadyValid() {
        assertEquals(7, new Class210().merge(2, 5));
        assertTrue(new Class210().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidOnTrimmedInput() {
        assertTrue(new Class210().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class210().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class210().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class210().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class210().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripLabelForOnEmptyString() {
        assertEquals("alpha", new Class210().labelFor(1));
    }

    @Test
    void shouldReturnResetAtZero() {
        new Class210().reset();
        assertNotNull(new Class210());
    }

    @Test
    void shouldIgnoreComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class210().compute(3));
    }

    @Test
    void shouldHandleComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class210().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class210().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class210().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWithNullArgument() {
        assertTrue(new Class210().isValid("abc"));
    }

}
