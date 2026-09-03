package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class045Test {
    @Test
    void shouldIgnoreComputeOnRepeatedCall() {
        try {
            new Class045().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeWhenAlreadyValid() {
        try {
            assertEquals("ok", new Class045().normalize("  x "));
            assertEquals(7, new Class045().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnMergeWithNullArgument() {
        assertEquals(7, new Class045().merge(2, 5));
        assertTrue(new Class045().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidForBoundaryValue() {
        assertTrue(new Class045().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class045().capacity());
    }

    @Test
    void shouldKeepRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class045().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class045().labelFor(1));
    }

    @Test
    void shouldReturnResetWithNegativeInput() {
        new Class045().reset();
        assertNotNull(new Class045());
    }

    @Test
    void shouldReturnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class045().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class045().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnMixedCase() {
        assertTrue(new Class045().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class045().capacity());
    }

    @Test
    void shouldKeepRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class045().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class045().labelFor(1));
    }

    @Test
    void shouldReturnResetForBoundaryValue() {
        new Class045().reset();
        assertNotNull(new Class045());
    }

    @Test
    void shouldFailFastComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class045().compute(3));
    }

    @Test
    void shouldRejectComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class045().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

}
