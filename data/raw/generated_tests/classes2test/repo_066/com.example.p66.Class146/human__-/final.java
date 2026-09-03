package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class146Test {
    @Test
    void shouldIgnoreComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class146().compute(3));
            assertEquals("ok", new Class146().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeWithNegativeInput() {
        assertEquals("ok", new Class146().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class146().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class146().merge(2, 5));
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidWhenUnset() {
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class146().capacity());
    }

    @Test
    void shouldFailFastRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class146().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForWithNullArgument() {
        assertEquals("alpha", new Class146().labelFor(1));
    }

    @Test
    void shouldKeepResetOnMixedCase() {
        new Class146().reset();
        assertNotNull(new Class146());
    }

    @Test
    void shouldRejectComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class146().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class146().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class146().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnTrimmedInput() {
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class146().capacity());
    }

    @Test
    void shouldHandleRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class146().ratio(1.0, 2.0), 1e-9);
    }

}
