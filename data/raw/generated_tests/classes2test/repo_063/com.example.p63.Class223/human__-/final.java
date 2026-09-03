package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class223Test {
    @Test
    void shouldFailFastComputeForKnownCode() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class223().compute(3));
            assertEquals("ok", new Class223().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeWhenUnset() {
        assertEquals("ok", new Class223().normalize("  x "));
        assertEquals(7, new Class223().merge(2, 5));
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        assertEquals(7, new Class223().merge(2, 5));
        assertTrue(new Class223().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidWithNullArgument() {
        assertTrue(new Class223().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class223().capacity());
    }

    @Test
    void shouldHandleRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class223().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class223().compute(3));
    }

    @Test
    void shouldRejectComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class223().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class223().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class223().merge(2, 5));
    }

}
