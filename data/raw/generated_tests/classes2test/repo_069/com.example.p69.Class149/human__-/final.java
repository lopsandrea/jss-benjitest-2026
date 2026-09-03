package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class149Test {
    @Test
    void shouldReturnComputeWithNullArgument() {
        new Class149().compute(3);
    }

    @Test
    void shouldNotThrowOnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class149().normalize("  x "));
        assertEquals(7, new Class149().merge(2, 5));
    }

    @Test
    void shouldHandleMergeForKnownCode() {
        assertEquals(7, new Class149().merge(2, 5));
        assertTrue(new Class149().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidOnEmptyString() {
        assertTrue(new Class149().isValid("abc"));
        assertEquals(16, new Class149().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class149().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class149().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class149().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class149().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class149().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWithNegativeInput() {
        assertTrue(new Class149().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class149().capacity());
    }

    @Test
    void shouldReturnComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class149().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeAtZero() {
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class149().merge(2, 5));
    }

}
