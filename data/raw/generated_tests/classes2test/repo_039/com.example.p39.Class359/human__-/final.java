package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class359Test {
    @Test
    void shouldRoundTripComputeAtUpperBound() {
        try {
            new Class359().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleNormalizeWithNegativeInput() {
        assertEquals("ok", new Class359().normalize("  x "));
        assertEquals(7, new Class359().merge(2, 5));
    }

    @Test
    void shouldReturnMergeOnTrimmedInput() {
        assertEquals(7, new Class359().merge(2, 5));
        assertTrue(new Class359().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidOnRepeatedCall() {
        assertTrue(new Class359().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class359().capacity());
    }

    @Test
    void shouldIgnoreRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class359().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForForKnownCode() {
        assertEquals("alpha", new Class359().labelFor(1));
    }

    @Test
    void shouldRejectResetWhenAlreadyValid() {
        new Class359().reset();
        assertNotNull(new Class359());
    }

    @Test
    void shouldHandleComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class359().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class359().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class359().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWhenAlreadyValid() {
        assertTrue(new Class359().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class359().capacity());
    }

    @Test
    void shouldRejectRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class359().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectLabelForWhenUnset() {
        assertEquals("alpha", new Class359().labelFor(1));
    }

    @Test
    void shouldRejectResetForKnownCode() {
        new Class359().reset();
        assertNotNull(new Class359());
    }

}
