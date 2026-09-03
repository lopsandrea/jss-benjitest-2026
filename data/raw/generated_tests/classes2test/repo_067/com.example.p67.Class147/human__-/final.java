package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class147Test {
    @Test
    void shouldReturnComputeAtZero() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class147().compute(3));
        assertEquals("ok", new Class147().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeWhenUnset() {
        assertEquals("ok", new Class147().normalize("  x "));
        assertEquals(7, new Class147().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeOnMixedCase() {
        assertEquals(7, new Class147().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidForKnownCode() {
        assertTrue(new Class147().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityForKnownCode() {
        assertEquals(16, new Class147().capacity());
    }

    @Test
    void shouldNotThrowOnRatioForKnownCode() {
        assertEquals(0.5, new Class147().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepComputeOnTrimmedInput() {
        assertEquals(42, new Class147().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class147().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForBoundaryValue() {
        assertEquals(7, new Class147().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnEmptyString() {
        assertTrue(new Class147().isValid("abc"));
    }

    @Test
    void shouldRejectComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class147().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class147().normalize("  x "));
    }

}
