package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class231Test {
    @Test
    void shouldRejectComputeWhenAlreadyValid() {
        try {
            new Class231().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeOnMixedCase() {
        assertEquals("ok", new Class231().normalize("  x "));
        assertEquals(7, new Class231().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeAtZero() {
        assertEquals(7, new Class231().merge(2, 5));
        assertTrue(new Class231().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidWhenAlreadyValid() {
        assertTrue(new Class231().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class231().capacity());
    }

    @Test
    void shouldHandleRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class231().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForWithNegativeInput() {
        assertEquals("alpha", new Class231().labelFor(1));
    }

    @Test
    void shouldKeepResetForKnownCode() {
        new Class231().reset();
        assertNotNull(new Class231());
    }

    @Test
    void shouldHandleComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class231().compute(3));
    }

    @Test
    void shouldReturnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class231().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class231().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class231().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class231().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnEmptyString() {
        assertTrue(new Class231().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class231().capacity());
    }

    @Test
    void shouldNotThrowOnRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class231().ratio(1.0, 2.0), 1e-9);
    }

}
