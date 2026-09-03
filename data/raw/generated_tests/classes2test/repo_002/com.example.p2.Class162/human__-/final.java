package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class162Test {
    @Test
    void shouldKeepComputeOnMixedCase() {
        try {
            new Class162().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeAtZero() {
        assertEquals("ok", new Class162().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWhenAlreadyValid() {
        assertEquals(7, new Class162().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWhenUnset() {
        assertTrue(new Class162().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityOnTrimmedInput() {
        assertEquals(16, new Class162().capacity());
    }

    @Test
    void shouldReturnRatioWithNegativeInput() {
        assertEquals(0.5, new Class162().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectLabelForOnMixedCase() {
        assertEquals("alpha", new Class162().labelFor(1));
    }

    @Test
    void shouldRejectResetWithNullArgument() {
        new Class162().reset();
        assertNotNull(new Class162());
    }

    @Test
    void shouldRejectComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class162().compute(3));
    }

    @Test
    void shouldFailFastNormalizeForBoundaryValue() {
        assertEquals("ok", new Class162().normalize("  x "));
    }

    @Test
    void shouldRoundTripComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class162().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class162().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class162().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidForBoundaryValue() {
        assertTrue(new Class162().isValid("abc"));
    }

}
