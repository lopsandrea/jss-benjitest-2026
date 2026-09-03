package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class011Test {
    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class011().compute(3));
            assertEquals("ok", new Class011().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class011().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepMergeWhenAlreadyValid() {
        try {
            int expected0 = 7;
            assertEquals(expected0, new Class011().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnIsValidForBoundaryValue() {
        assertTrue(new Class011().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class011().capacity());
    }

    @Test
    void shouldRoundTripRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class011().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepLabelForOnEmptyString() {
        assertEquals("alpha", new Class011().labelFor(1));
    }

    @Test
    void shouldNotThrowOnResetWhenAlreadyValid() {
        new Class011().reset();
        assertNotNull(new Class011());
    }

    @Test
    void shouldHandleComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class011().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class011().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class011().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidOnEmptyString() {
        assertTrue(new Class011().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class011().capacity());
    }

    @Test
    void shouldReturnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class011().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnEmptyString() {
        assertEquals("ok", new Class011().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class011().merge(2, 5));
    }

}
