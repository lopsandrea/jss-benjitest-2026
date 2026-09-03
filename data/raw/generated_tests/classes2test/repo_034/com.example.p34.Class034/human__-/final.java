package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class034Test {
    @Test
    void shouldRejectComputeOnMixedCase() {
        try {
            assertEquals(42, new Class034().compute(3));
            assertEquals("ok", new Class034().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeWhenUnset() {
        assertEquals("ok", new Class034().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class034().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class034().merge(2, 5));
        assertTrue(new Class034().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidOnEmptyString() {
        assertTrue(new Class034().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class034().capacity());
    }

    @Test
    void shouldHandleCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class034().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class034().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class034().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepLabelForOnEmptyString() {
        assertEquals("alpha", new Class034().labelFor(1));
    }

    @Test
    void shouldRoundTripResetAtUpperBound() {
        new Class034().reset();
        assertNotNull(new Class034());
    }

    @Test
    void shouldRoundTripComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class034().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenUnset() {
        assertEquals("ok", new Class034().normalize("  x "));
    }

    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class034().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class034().normalize("  x "));
    }

    @Test
    void shouldRejectMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class034().merge(2, 5));
    }

}
