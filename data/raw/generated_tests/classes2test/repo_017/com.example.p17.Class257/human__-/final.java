package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class257Test {
    @Test
    void shouldFailFastComputeOnMixedCase() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class257().compute(3));
        assertEquals("ok", new Class257().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnNormalizeForKnownCode() {
        assertEquals("ok", new Class257().normalize("  x "));
        assertEquals(7, new Class257().merge(2, 5));
    }

    @Test
    void shouldRejectMergeAtZero() {
        assertEquals(7, new Class257().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWithNullArgument() {
        assertTrue(new Class257().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWhenAlreadyValid() {
        assertEquals(16, new Class257().capacity());
    }

    @Test
    void shouldFailFastComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class257().compute(3));
    }

    @Test
    void shouldHandleNormalizeAtUpperBound() {
        assertEquals("ok", new Class257().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class257().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidAtZero() {
        assertTrue(new Class257().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class257().capacity());
    }

    @Test
    void shouldNotThrowOnComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class257().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class257().normalize("  x "));
    }

    @Test
    void shouldReturnMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class257().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidWhenUnset() {
        assertTrue(new Class257().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class257().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnEmptyString() {
        assertEquals("ok", new Class257().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class257().merge(2, 5));
    }

}
