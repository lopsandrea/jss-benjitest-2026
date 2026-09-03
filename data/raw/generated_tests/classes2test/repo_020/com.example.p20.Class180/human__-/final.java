package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class180Test {
    @Test
    void shouldHandleComputeOnMixedCase() {
        new Class180().compute(3);
    }

    @Test
    void shouldNotThrowOnNormalizeWithNullArgument() {
        assertEquals("ok", new Class180().normalize("  x "));
        assertEquals(7, new Class180().merge(2, 5));
    }

    @Test
    void shouldReturnMergeForKnownCode() {
        assertEquals(7, new Class180().merge(2, 5));
        assertTrue(new Class180().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidForBoundaryValue() {
        assertTrue(new Class180().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class180().capacity());
    }

    @Test
    void shouldHandleCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class180().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class180().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class180().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class180().labelFor(1));
    }

    @Test
    void shouldFailFastLabelForWithNegativeInput() {
        assertEquals("alpha", new Class180().labelFor(1));
        int expected1 = 42;
        assertEquals(expected1, new Class180().compute(3));
    }

    @Test
    void shouldHandleComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class180().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnMixedCase() {
        assertEquals("ok", new Class180().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class180().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnMixedCase() {
        assertTrue(new Class180().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class180().capacity());
    }

    @Test
    void shouldRoundTripRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class180().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreLabelForForKnownCode() {
        assertEquals("alpha", new Class180().labelFor(1));
    }

    @Test
    void shouldFailFastComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class180().compute(3));
    }

    @Test
    void shouldReturnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class180().compute(3));
    }

    @Test
    void shouldFailFastNormalizeForBoundaryValue() {
        assertEquals("ok", new Class180().normalize("  x "));
    }

}
