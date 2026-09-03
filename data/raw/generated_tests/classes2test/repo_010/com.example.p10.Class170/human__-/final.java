package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class170Test {
    @Test
    void shouldFailFastComputeOnEmptyString() {
        assertEquals(42, new Class170().compute(3));
        assertEquals("ok", new Class170().normalize("  x "));
    }

    @Test
    void shouldHandleNormalizeAtUpperBound() {
        assertEquals("ok", new Class170().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnEmptyString() {
        assertEquals(7, new Class170().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidForBoundaryValue() {
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityOnTrimmedInput() {
        assertEquals(16, new Class170().capacity());
    }

    @Test
    void shouldKeepRatioOnRepeatedCall() {
        assertEquals(0.5, new Class170().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class170().labelFor(1));
    }

    @Test
    void shouldNotThrowOnComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class170().compute(3));
    }

    @Test
    void shouldRejectNormalizeForBoundaryValue() {
        assertEquals("ok", new Class170().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class170().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnRepeatedCall() {
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void shouldReturnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class170().compute(3));
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        assertEquals("ok", new Class170().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class170().merge(2, 5));
    }

}
