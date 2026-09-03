package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class378Test {
    @Test
    void shouldRoundTripComputeOnRepeatedCall() {
        new Class378().compute(3);
    }

    @Test
    void shouldNotThrowOnNormalizeWithNullArgument() {
        assertEquals("ok", new Class378().normalize("  x "));
        assertEquals(7, new Class378().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeAtZero() {
        assertEquals(7, new Class378().merge(2, 5));
        assertTrue(new Class378().isValid("abc"));
    }

    @Test
    void shouldHandleIsValidOnTrimmedInput() {
        assertTrue(new Class378().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class378().capacity());
    }

    @Test
    void shouldRejectCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class378().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class378().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class378().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class378().labelFor(1));
    }

    @Test
    void shouldIgnoreLabelForWhenUnset() {
        assertEquals("alpha", new Class378().labelFor(1));
    }

    @Test
    void shouldIgnoreComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class378().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeForKnownCode() {
        assertEquals("ok", new Class378().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class378().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidForKnownCode() {
        assertTrue(new Class378().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class378().capacity());
    }

    @Test
    void shouldIgnoreRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class378().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripLabelForOnEmptyString() {
        assertEquals("alpha", new Class378().labelFor(1));
    }

    @Test
    void shouldHandleComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class378().compute(3));
    }

    @Test
    void shouldFailFastComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class378().compute(3));
    }

    @Test
    void shouldHandleNormalizeAtZero() {
        assertEquals("ok", new Class378().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class378().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWithNegativeInput() {
        assertTrue(new Class378().isValid("abc"));
    }

}
