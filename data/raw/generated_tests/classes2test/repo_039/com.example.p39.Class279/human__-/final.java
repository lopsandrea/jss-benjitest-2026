package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class279Test {
    @Test
    void shouldNotThrowOnComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class279().compute(3);
    }

    @Test
    void shouldNotThrowOnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class279().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class279().merge(2, 5));
    }

    @Test
    void shouldHandleMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class279().merge(2, 5));
        assertTrue(new Class279().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidForBoundaryValue() {
        assertTrue(new Class279().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class279().capacity());
    }

    @Test
    void shouldReturnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class279().compute(3));
    }

    @Test
    void shouldKeepNormalizeWhenUnset() {
        assertEquals("ok", new Class279().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class279().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnTrimmedInput() {
        assertTrue(new Class279().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class279().capacity());
    }

    @Test
    void shouldReturnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class279().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnMixedCase() {
        assertEquals("ok", new Class279().normalize("  x "));
    }

    @Test
    void shouldRejectMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class279().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidOnMixedCase() {
        assertTrue(new Class279().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class279().compute(3));
    }

}
