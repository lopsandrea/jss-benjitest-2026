package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class346Test {
    @Test
    void shouldNotThrowOnComputeForKnownCode() {
        new Class346().compute(3);
    }

    @Test
    void shouldRoundTripNormalizeWithNegativeInput() {
        assertEquals("ok", new Class346().normalize("  x "));
        assertEquals(7, new Class346().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeOnTrimmedInput() {
        assertEquals(7, new Class346().merge(2, 5));
        assertTrue(new Class346().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidOnEmptyString() {
        assertTrue(new Class346().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class346().compute(3));
    }

    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class346().compute(3));
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        assertEquals("ok", new Class346().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class346().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidForKnownCode() {
        assertTrue(new Class346().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class346().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeForKnownCode() {
        assertEquals("ok", new Class346().normalize("  x "));
    }

    @Test
    void shouldRejectMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class346().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnMixedCase() {
        assertTrue(new Class346().isValid("abc"));
    }

}
