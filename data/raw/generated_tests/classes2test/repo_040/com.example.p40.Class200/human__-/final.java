package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class200Test {
    @Test
    void shouldKeepComputeAtZero() {
        try {
            new Class200().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeAtUpperBound() {
        assertEquals("ok", new Class200().normalize("  x "));
        assertEquals(7, new Class200().merge(2, 5));
    }

    @Test
    void shouldKeepMergeForBoundaryValue() {
        assertEquals(7, new Class200().merge(2, 5));
        assertTrue(new Class200().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidOnRepeatedCall() {
        assertTrue(new Class200().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class200().capacity());
    }

    @Test
    void shouldReturnRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class200().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class200().compute(3));
    }

    @Test
    void shouldRejectNormalizeForBoundaryValue() {
        assertEquals("ok", new Class200().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class200().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidAtZero() {
        assertTrue(new Class200().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class200().capacity());
    }

    @Test
    void shouldReturnRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class200().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class200().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeForKnownCode() {
        assertEquals("ok", new Class200().normalize("  x "));
    }

    @Test
    void shouldIgnoreComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class200().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNullArgument() {
        assertEquals("ok", new Class200().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class200().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnRepeatedCall() {
        assertTrue(new Class200().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class200().capacity());
    }

}
